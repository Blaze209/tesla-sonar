package e60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\f\ba\u0018\u00002\u00020\u0001:\u0001\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0004H&¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Le60/e;", "", "Le60/e$a;", "state", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Le60/e$a;)V", "b", "()V", "", "isInline", "g", "(Z)V", "c", "", AnalyticsAttribute.Error, "e", "(ZLjava/lang/Throwable;)V", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Throwable;)V", "a", "f", "h", "k", "l", "j", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Le60/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "RequiresSignUp", "RequiresVerification", "Verified", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        RequiresSignUp,
        RequiresVerification,
        Verified;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    void a();

    void b();

    void c(boolean isInline);

    void d(a state);

    void e(boolean isInline, Throwable error);

    void f();

    void g(boolean isInline);

    void h();

    void i(Throwable error);

    void j();

    void k(Throwable error);

    void l();
}
