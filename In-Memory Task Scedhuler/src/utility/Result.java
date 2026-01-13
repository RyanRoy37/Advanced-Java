package utility;
import static utility.ResultType.*;
public class Result {
    private final ResultType resultType;

    public Result(ResultType resultType) {
        this .resultType = resultType;
    }
    public ResultType getResultType() {
        return resultType;
    }
}
