package Lecture11;
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


  public class Polynomial {

	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
    int arr[] = new int[0];
	public void setCoefficient(int degree, int coeff){
        if(arr.length <= degree){
            int newArr[] = new int[arr.length];
            newArr = arr.clone();
            arr = new int[degree+1];
            for(int i=0;i<newArr.length;i++){
                arr[i] = newArr[i];
            }
                
        }
        arr[degree] = coeff;
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
        
		for(int i=0;i<this.arr.length;i++){
            if(this.arr[i] != 0){
                System.out.print(this.arr[i]+"x"+i+" ");
            }
        }
        System.out.println();
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
        
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(this.arr[i]);    
        // }
               
        Polynomial res = new Polynomial();
        res.arr = new int[Math.max(p.arr.length,this.arr.length)+1];
        int min = Math.min(p.arr.length,this.arr.length);
        for(int i=0;i<min;i++){
            //System.out.println("***"+p.arr[i]+"****"+this.arr[i]);
            res.arr[i] = p.arr[i] + this.arr[i]; 
        }
        int k = 0;
        if(p.arr.length == min){
            k = 1;
        }
        else{
            k = 2;
        }
        for(int i=min;i<Math.max(p.arr.length,this.arr.length);i++){
            if(k == 1){
                res.arr[i] = this.arr[i];
            } 
            else{
                res.arr[i] = p.arr[i];
            }
        }
    
        return res;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		
        Polynomial res = new Polynomial();
        res.arr = new int[Math.max(p.arr.length,this.arr.length)+1];
        
        int min = Math.min(p.arr.length,this.arr.length);
        for(int i=0;i<min;i++){
            //System.out.println("***"+p.arr[i]+"****"+this.arr[i]);
            res.arr[i] = this.arr[i]-p.arr[i]; 
        }
        int k = 0;
        if(p.arr.length == min){
            k = 1;
        }
        else{
            k = 2;
        }
        for(int i=min;i<Math.max(p.arr.length,this.arr.length);i++){
            if(k == 1){
                res.arr[i] = this.arr[i];
            } 
            else{
                res.arr[i] = -p.arr[i];
            }
        }
        
        return res;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial res = new Polynomial();
        res.arr = new int[p.arr.length+this.arr.length];
        for(int i=0;i<this.arr.length;i++){
            for(int j=0;j<p.arr.length;j++){
                if((this.arr[i] !=0)&& (p.arr[j] != 0)){
                    res.arr[i+j] += this.arr[i]*p.arr[j];
                }
            }
        }
        return res;
	}

}
