package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import kotlinx.coroutines.flow.StateFlow;
import o4.z0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\tR\u001a\u0010\u0011\u001a\u00020\u000e8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00198&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0016\u0010)\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Li90/u1;", "", "", "input", "Li90/x1;", "g", "(Ljava/lang/String;)Li90/x1;", "userTyped", "j", "(Ljava/lang/String;)Ljava/lang/String;", "displayName", "h", "rawValue", "a", "Lo4/x;", "e", "()I", "capitalization", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "debugLabel", "", "getLabel", "()Ljava/lang/Integer;", AnnotatedPrivateKey.LABEL, "Lo4/y;", "k", "keyboard", "Lo4/z0;", "c", "()Lo4/z0;", "visualTransformation", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/w1;", "f", "()Lkotlinx/coroutines/flow/StateFlow;", "trailingIcon", "", "b", "loading", DateTokenConverter.CONVERTER_KEY, "placeHolder", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface u1 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static String a(u1 u1Var) {
            return null;
        }
    }

    String a(String rawValue);

    StateFlow<Boolean> b();

    /* JADX INFO: renamed from: c */
    z0 getVisualTransformation();

    String d();

    /* JADX INFO: renamed from: e */
    int getCapitalization();

    StateFlow<w1> f();

    x1 g(String input);

    Integer getLabel();

    String h(String displayName);

    /* JADX INFO: renamed from: i */
    String getDebugLabel();

    String j(String userTyped);

    /* JADX INFO: renamed from: k */
    int getKeyboard();
}
