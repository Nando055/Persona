
public class Persona
{
    private String nombre;
    private Integer edad;
    private Integer DNI=0;
    private char sexo;
    private Double peso=0.0;
    private Double altura=0.0;
    
    public Persona()
    {
        this.nombre="";
        this.edad=0;
        this.DNI=0;
        this.sexo='H';
        this.peso=0.0;
        this.altura=0.0;
    }

    public Persona(String nombre,Integer edad, char sexo)
    {
        
        if(sexo=='H' || sexo=='M')
        { 
            this.sexo=sexo;
            this.nombre=nombre;
            this.edad=edad;
        } 
        else
        {
            System.out.println("Ingrese el tipo de sexo: H o M");
            System.out.println("Por favor editarlo con los metodos correspondientes e ingresar bien los datos");
        }
    } 
    
    public Persona(String nombre,Integer edad, char sexo, Double peso, Double altura)
    {
        if(sexo=='H' || sexo=='M')
        { 
            this.sexo=sexo;
            this.nombre=nombre;
            this.edad=edad;
            this.DNI=0;
            this.peso=peso;
            this.altura=altura;
        } 
        else
        {
            System.out.println("Ingrese el tipo de sexo: H o M");
            System.out.println("Por favor editarlo con los metodos correspondientes e ingresar bien los datos");
        }
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Integer getEdad(){
        return this.edad;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public Double getPeso(){
        return this.peso;
    }
    
    public Double getAltura(){
        return this.altura;
    }
    
    public Integer getDNI(){
        return this.DNI;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(Integer edad){
        this.edad=edad;
    }
    
    public void setSexo(char sexo){
        if(sexo=='H' || sexo=='M')
        { 
            this.sexo=sexo;
        } 
        else
        {
            System.out.println("Ingrese el tipo de sexo: H o M");
        }
    }
    
    public void setPeso(Double peso){
        this.peso=peso;
    }
    
    public void setAltura(Double altura){
        this.altura=altura;
    }
    
    //METODOS ANALIZADORES
    
    public Integer generarDNI()
    {
        int aux=1;
        Integer dni=0;
        for(int i=0;i<8;i++)
        {
          dni=dni+( (int)(Math.random()*10) *aux );  
          aux=aux*10;  
        }
        this.DNI=dni;
        return DNI;
    }
    
    public Integer calcularIMC()
    {
        double peso= getPeso();
        double altura= getAltura();
        Integer resultado;
        double aux= peso/(altura*altura);
        
        if(aux<20)
        {
            resultado=-1;
        } else{ if(aux>=20 && aux<=25)
                {
                    resultado=0;
                } 
                else{ resultado=1; }
        }
        return resultado;   
    }
    
    public boolean esMayorEdad()
    {
        Integer edad=getEdad();
        boolean mayor= edad>=18;
        return mayor;
    }
    
    public void comprobarSexo(char sexo)
    {
        char sexoP=getSexo();
        
        boolean igual= sexoP == sexo;
        
        if(igual){ System.out.println("El sexo es igual"); }
        else{ System.out.println("El sexo es: H"); }
    }
    
    public void mostrarDatos()
    {
        System.out.println("El nombre de la persona es: "+getNombre());
        System.out.println("La edad de la persona es: "+getEdad());
        System.out.println("El DNI de la pesona es: "+getDNI());
        System.out.println("El sexo de la persona es: "+getSexo());
        System.out.println("El peso de la persona es: "+getPeso());
        System.out.println("La altura de la persona es: "+getAltura());
    }
}

