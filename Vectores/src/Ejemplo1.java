
public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []v={14,15,1,2,3};
		int []w= v.clone();
		int []z=v;
		System.out.println("z[0]= "+z[0]);
		
		for(int i=0;i<w.length;i++)
			System.out.println("w["+i+"]= "+w[i]);
		v[0]=1500;
				
		
		System.out.println("w[0]= "+w[0]);
		System.out.println("z[0]= "+z[0]);
		if(v.equals(z)) System.out.println("z Igual a v");
		if(v.equals(w)) System.out.println("w Igual a v");
		//Hola Aitor esto esta editado por Niko
	}

}
