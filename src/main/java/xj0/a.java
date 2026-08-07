package xj0;

import com.google.android.gms.common.internal.ImagesContract;
import ezvcard.util.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f123618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f123619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f123620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f123621d;

    static {
        Properties properties = new Properties();
        InputStream resourceAsStream = null;
        try {
            try {
                resourceAsStream = a.class.getResourceAsStream("ez-vcard.properties");
                properties.load(resourceAsStream);
                f.a(resourceAsStream);
                f123618a = properties.getProperty("version");
                f123619b = properties.getProperty("groupId");
                f123620c = properties.getProperty("artifactId");
                f123621d = properties.getProperty(ImagesContract.URL);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        } catch (Throwable th2) {
            f.a(resourceAsStream);
            throw th2;
        }
    }

    private a() {
    }

    public static zj0.b<zj0.b<?>> a(InputStream inputStream) {
        return new zj0.b<>(inputStream);
    }
}
