package numberrangesummarizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SequentialGrouping implements NumberRangeSummarizer {

	@Override
	public Collection<Integer> collect(String input) {
		
		Collection<Integer> initial_list = new ArrayList<Integer>();  
		
		input = input.replaceAll("\\s", ""); //removes unnecessary whitespace
		String[] arrOfstr = input.split(","); // splits string by , into a string array
		int len = arrOfstr.length;//retrieves length of string
		
		///Parses Input from String[] type to Collection<Integer> type
		for(int i = 0;i < len;i++)
		{
			int toInt = Integer.parseInt(arrOfstr[i]);
			initial_list.add(toInt);
		}
		
		 Collection<Integer> list = initial_list.stream() /// Remove duplicate numbers
	                .distinct()
	                .collect(Collectors.toList());
		
		((ArrayList<Integer>) list).sort(Comparator.naturalOrder()); //Sort List
        
		return list;	
	}

	@Override
	public String summarizeCollection(Collection<Integer> input) 
	{
		StringBuilder sb = new StringBuilder(); 
		int previous = ((ArrayList<Integer>) input).get(0), start = previous;//Gets first number in Collection
				
		for(int next: ((ArrayList<Integer>) input).subList(1, input.size())) ///Loops through Collection
		{
			///Checks if next item in list is a direct follow thus checking sequentiality 
		    if(previous+1 != next) 
		    {
		        appendRange(sb, start, previous).append(", ");
		        start = next;
		    }
		    previous = next;
		}
		
		///Converts Stringbuilder result to String
		String result = appendRange(sb, start, previous).toString();
		return result;
	}
	
	
	///Custom build append object to append range
	private static StringBuilder appendRange(StringBuilder sb, int start, int previous) 
	{
	    sb.append(start);
	    if(start!=previous)
	    {
	    	sb.append(previous-start>1? " - ": ", ").append(previous);//appends numbers in correct format
	    }	    	
	    return sb;
	}
}
