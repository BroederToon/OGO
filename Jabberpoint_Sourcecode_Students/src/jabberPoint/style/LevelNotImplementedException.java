package jabberPoint.style;

public class LevelNotImplementedException extends Exception{

    @Override
    public String getMessage() {
        return "No implementation made for StyleLevel";
    }
}
