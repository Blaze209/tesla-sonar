package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Li90/x;", "", "", "index", "", "f", "(I)Ljava/lang/String;", "rawValue", "a", "(Ljava/lang/String;)Ljava/lang/String;", "getLabel", "()I", AnnotatedPrivateKey.LABEL, "", "b", "()Ljava/util/List;", "rawItems", "e", "displayItems", "", "c", "()Z", "tinyMode", DateTokenConverter.CONVERTER_KEY, "disableDropdownWithSingleElement", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface x {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static boolean a(x xVar) {
            return false;
        }

        public static boolean b(x xVar) {
            return false;
        }
    }

    String a(String rawValue);

    List<String> b();

    boolean c();

    boolean d();

    List<String> e();

    String f(int index);

    int getLabel();
}
