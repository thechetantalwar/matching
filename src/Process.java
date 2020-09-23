public class Process {
    private SomeService service;
    public Process(SomeService s)
    {
        this.service=s;
    }
    public String processing(){
        int someNumber = service.doSomething();
        return "Some Number is "+someNumber;
    }
}

