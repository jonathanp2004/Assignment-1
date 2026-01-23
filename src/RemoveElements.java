public class RemoveElements {

    public static int removeElements(double[] nums, double val){
        int k =0;

        for(int i =0; i < nums.length; i++){
            if(nums[i] >+ val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args){

        double[] nums = {3.5, 1.2, 2.1, 6.7,9.0,4.4};
        double val = 3.0;

        System.out.print("Input: nums = {" );
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
            System.out.print(",");
        }
        System.out.println("},  val =  " + val);

        int s = removeElements(nums,val);

        System.out.println("Output = " + s);
        System.out.print("Modified array: {");
        for(int i = 0; i < s; i++){
            System.out.print(nums[i]);
            System.out.print(",");
        }
        System.out.println("}");

    }
}
