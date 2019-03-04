//package hw8;
/**
 * 
 * @author Ahmet Melih YANALAK
 *
 */
public class mainclass {
	// PLEASE CHECK OUTPUT TO UNDERSTAND EXAMPLES
	public static void main(String[] args) {
		try{
			Integer arrInt[] = {1,2,2};
			Integer arrInt2[] = {2,3,4,4};
			String arrStr[] = {"ab","ab","c","d","e"};
			String arrStr2[] =  {"e","fg","fg","h"};
			HashSet<String> hsS = new HashSet<String>(arrStr);
			HashSet<String> hsS2 = new HashSet<String>(arrStr2);
			hsS.addAll(hsS2);
			hsS.add("i");
			hsS.remove("h");           // LINE 6-25  --> HashSet<String> examples
			hsS.removeAll(hsS2);
			String temp[] =  {"c","d"};
			HashSet<String> tempHS = new HashSet<String>(temp);
			hsS.retainAll(tempHS);
			hsS.iterator().begin();
			System.out.print("Result String HashSet\n");
			while(hsS.iterator().hasNext()) {
				System.out.print(hsS.iterator().get());
				System.out.print("-");
				hsS.iterator().next();
			}
			System.out.print("\n");
			System.out.print("\n");
			HashSet<Integer> hsI = new HashSet<Integer>(arrInt);
			HashSet<Integer> hsI2 = new HashSet<Integer>(arrInt2);
			hsI.addAll(hsI2);
			hsI.add(5);
			hsI.remove(3);
			hsI.removeAll(hsI2);     // LINE 28-43  --> HashSet<Integer> examples
			Integer temp2[] =  {1,2};
			HashSet<Integer> tempHS2 = new HashSet<Integer>(temp2);
			hsI.retainAll(tempHS2);
			hsI.iterator().begin();
			System.out.print("Result Integer HashSet\n");
			while(hsI.iterator().hasNext()) {
				System.out.print(hsI.iterator().get());
				System.out.print("-");
				hsI.iterator().next();
			}
			System.out.print("\n");
			System.out.print("\n");
			Integer arrInt3[] = {1,2,2};
			Integer arrInt4[] = {2,3,4,4};
			String arrStr3[] = {"ab","ab","c","d","e"};
			String arrStr4[] =  {"e","fg","fg","h"};
			ArrayList<String> alS = new ArrayList<String>(arrStr3);
			ArrayList<String> alS2 = new ArrayList<String>(arrStr4);
			alS.addAll(alS2);
			alS.add("i");
			alS.remove("h");     // LINE 46-65  --> ArrayList<String> examples
			alS.removeAll(alS2);
			String temp3[] =  {"c","d"};
			HashSet<String> tempHS3 = new HashSet<String>(temp3);
			alS.retainAll(tempHS3);
			alS.iterator().begin();
			System.out.print("Result String ArrayList\n");
			while(alS.iterator().hasNext()) {
				System.out.print(alS.iterator().get());
				System.out.print("-");
				alS.iterator().next();
			}
			System.out.print("\n");
			System.out.print("\n");
			ArrayList<Integer> alI = new ArrayList<Integer>(arrInt);
			ArrayList<Integer> alI2 = new ArrayList<Integer>(arrInt2);
			alI.addAll(alI2);
			alI.add(5);
			alI.remove(3);
			alI.removeAll(alI2);
			Integer temp4[] =  {1,2};   // LINE 68-84  --> ArrayList<Integer> examples
			HashSet<Integer> tempHS4 = new HashSet<Integer>(temp4);
			alI.retainAll(tempHS4);
			alI.iterator().begin();
			int i = 0;
			System.out.print("Result Integer ArrayList\n");
			while(i < alI.size()) {
				System.out.print(alI.get(i));
				System.out.print("-");
				i++;
			}
			System.out.print("\n");
			System.out.print("\n");
			Integer arrInt5[] = {1,2,2};
			Integer arrInt6[] = {2,3,4,4};
			String arrStr5[] = {"ab","ab","c","d","e"};
			String arrStr6[] =  {"e","fg","fg","h"};
			LinkedList<String> llS = new LinkedList<String>(arrStr5);
			LinkedList<String> llS2 = new LinkedList<String>(arrStr6);
			llS.addAll(llS2);
			llS.add("i");
			llS.remove("h");
			llS.removeAll(llS2);  // LINE 87-106  --> LinkedList<String> examples
			String temp5[] =  {"c","d"};
			HashSet<String> tempHS5 = new HashSet<String>(temp5);
			llS.retainAll(tempHS5);
			llS.iterator().begin();
			System.out.print("Result String LinkedList\n");
			while(llS.iterator().hasNext()) {
				System.out.print(llS.iterator().get());
				System.out.print("-");
				llS.iterator().next();
			}
			System.out.print("\n");
			System.out.print("\n");
			LinkedList<Integer> llI = new LinkedList<Integer>(arrInt5);
			LinkedList<Integer> llI2 = new LinkedList<Integer>(arrInt6);
			llI.addAll(llI2);
			llI.add(5);
			llI.remove(3);
			llI.removeAll(llI2);
			Integer temp6[] =  {1,2};   // LINE 109-124  --> LinkedList<Integer> examples
			HashSet<Integer> tempHS6 = new HashSet<Integer>(temp6);
			llI.retainAll(tempHS6);
			llI.iterator().begin();
			System.out.print("Result Integer LinkedList\n");
			while(llI.iterator().hasNext()) {
				System.out.print(llI.iterator().get());
				System.out.print("-");
				llI.iterator().next();
			}
			
			// USING OTHER METHODS 
			System.out.print("\n");
			System.out.print("\n");
			System.out.println("Does linkedlist include 1 = "+llI.contains(1));
			System.out.println("Is the linked list empty = "+llI.isEmpty());
			System.out.println("The head of linkedlist(element method) = "+llI.element());
			llI.poll();
			System.out.println("The head of linkedlist(after pop with poll method) = "+llI.element());
			llI.offer(3);
			System.out.println("The last element of linkedlist(after inserting 3 with offer method) = "+llI.get(1));
			llI.clear();
			System.out.println("After clear method,is the linked list empty = "+llI.isEmpty());
		}
		catch(Exception e){
			System.out.println("Error Occured");
		}
	}
}
