package ep;

import androidx.camera.core.impl.q2;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\t\u0010\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0011"}, d2 = {"Lep/b;", "", "<init>", "()V", "", "tag", "", "sectionName", "Lep/b$a;", "a", "(JLjava/lang/String;)Lep/b$a;", "b", "(J)Lep/b$a;", "", "Z", "INCLUDE_ARGS", "c", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f63112a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static boolean INCLUDE_ARGS;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lep/b$a;", "", "<init>", "()V", "Ljn0/h0;", "c", "", Action.KEY_ATTRIBUTE, "value", "b", "(Ljava/lang/String;Ljava/lang/Object;)Lep/b$a;", "", "a", "(Ljava/lang/String;I)Lep/b$a;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a {
        public abstract a a(String key, int value);

        public abstract a b(String key, Object value);

        public abstract void c();
    }

    /* JADX INFO: renamed from: ep.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lep/b$b;", "Lep/b$a;", "", "tag", "<init>", "(J)V", "Ljn0/h0;", "c", "()V", "", Action.KEY_ATTRIBUTE, "", "value", "b", "(Ljava/lang/String;Ljava/lang/Object;)Lep/b$a;", "", "a", "(Ljava/lang/String;I)Lep/b$a;", "J", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class C1296b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long tag;

        public C1296b(long j11) {
            this.tag = j11;
        }

        @Override // ep.b.a
        public a a(String key, int value) {
            s.k(key, "key");
            return this;
        }

        @Override // ep.b.a
        public a b(String key, Object value) {
            s.k(key, "key");
            s.k(value, "value");
            return this;
        }

        @Override // ep.b.a
        public void c() {
            ep.a.i(this.tag);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001a"}, d2 = {"Lep/b$c;", "Lep/b$a;", "", "tag", "", "sectionName", "<init>", "(JLjava/lang/String;)V", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "c", "()V", "", "b", "(Ljava/lang/String;Ljava/lang/Object;)Lep/b$a;", "", "a", "(Ljava/lang/String;I)Lep/b$a;", "J", "Ljava/lang/String;", "", "Ljava/util/List;", "args", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long tag;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String sectionName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<String> args;

        public c(long j11, String sectionName) {
            s.k(sectionName, "sectionName");
            this.tag = j11;
            this.sectionName = sectionName;
            this.args = new ArrayList();
        }

        private final void d(String key, String value) {
            this.args.add(key + ": " + value);
        }

        @Override // ep.b.a
        public a a(String key, int value) {
            s.k(key, "key");
            d(key, String.valueOf(value));
            return this;
        }

        @Override // ep.b.a
        public a b(String key, Object value) {
            s.k(key, "key");
            s.k(value, "value");
            d(key, value.toString());
            return this;
        }

        @Override // ep.b.a
        public void c() {
            String str;
            long j11 = this.tag;
            String str2 = this.sectionName;
            if (!b.INCLUDE_ARGS || this.args.isEmpty()) {
                str = "";
            } else {
                str = " (" + q2.a(", ", this.args) + ")";
            }
            ep.a.c(j11, str2 + str);
        }
    }

    private b() {
    }

    public static final a a(long tag, String sectionName) {
        s.k(sectionName, "sectionName");
        return new c(tag, sectionName);
    }

    public static final a b(long tag) {
        return new C1296b(tag);
    }
}
