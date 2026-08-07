package nz;

import java.security.AlgorithmParameters;
import java.security.Provider;

/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static AlgorithmParameters a(String str, Provider provider) {
        return provider == null ? AlgorithmParameters.getInstance(str) : AlgorithmParameters.getInstance(str, provider);
    }
}
