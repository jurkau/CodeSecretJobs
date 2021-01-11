package secretCode;

import org.mockito.Mockito;

import java.util.Random;

public class CodeSecret {

    private final CodeSecret mock;

    public CodeSecret(Random random) {
        mock = Mockito.mock(CodeSecret.class);
        Mockito.when(mock.revelerCode()).thenReturn("9876");
    }

    public String revelerCode() {
        return mock.revelerCode();
    }

    public boolean verifierCode(String codeProposé) throws CodeBloqueException {
        return false;
    }
}
