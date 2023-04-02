package jabberPoint.loaders;

public abstract class LoaderFactory {

    public static DemoPresentation createDemoPresentation(){
        return new DemoPresentation();
    }

    public static XMLAccessor createXMLAccessor(){
        return new XMLAccessor();
    }
}
