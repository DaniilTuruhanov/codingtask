package concerttours.validators;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotLoremIpsumValidator implements ConstraintValidator<concerttours.constraints.NotLoremIpsum, String>
{
    @Override
    public void initialize(final concerttours.constraints.NotLoremIpsum constraintAnnotation)
    {
        // empty
    }
    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context)
    {
        return value != null && !value.isEmpty() && !value.toLowerCase().startsWith("lorem ipsum");
    }
}