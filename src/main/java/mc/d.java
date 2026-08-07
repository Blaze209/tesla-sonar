package mc;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ec.n;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0005J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\f\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lmc/d;", "", "Lmc/d$b;", Action.KEY_ATTRIBUTE, "Lmc/d$c;", "a", "(Lmc/d$b;)Lmc/d$c;", "value", "Ljn0/h0;", "e", "(Lmc/d$b;Lmc/d$c;)V", "", "size", DateTokenConverter.CONVERTER_KEY, "(J)V", "clear", "()V", "getSize", "()J", "b", "c", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00002\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0017"}, d2 = {"Lmc/d$a;", "", "<init>", "()V", "Landroid/content/Context;", "Lcoil3/PlatformContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "percent", "c", "(Landroid/content/Context;D)Lmc/d$a;", "Lmc/d;", "b", "()Lmc/d;", "Lkotlin/Function0;", "", "a", "Lwn0/a;", "maxSizeBytesFactory", "", "Z", "strongReferencesEnabled", "weakReferencesEnabled", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private wn0.a<Long> maxSizeBytesFactory;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean strongReferencesEnabled = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean weakReferencesEnabled = true;

        public static /* synthetic */ a d(a aVar, Context context, double d11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                d11 = yc.e.a(context);
            }
            return aVar.c(context, d11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long e(double d11, Context context) {
            return (long) (d11 * yc.e.g(context));
        }

        public final d b() {
            i aVar;
            j hVar = this.weakReferencesEnabled ? new h() : new b();
            if (this.strongReferencesEnabled) {
                wn0.a<Long> aVar2 = this.maxSizeBytesFactory;
                if (aVar2 == null) {
                    throw new IllegalStateException("maxSizeBytesFactory == null");
                }
                long jLongValue = aVar2.invoke().longValue();
                aVar = jLongValue > 0 ? new g(jLongValue, hVar) : new mc.a(hVar);
            } else {
                aVar = new mc.a(hVar);
            }
            return new f(aVar, hVar);
        }

        public final a c(final Context context, final double percent) {
            if (0.0d > percent || percent > 1.0d) {
                throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
            }
            this.maxSizeBytesFactory = new wn0.a() { // from class: mc.c
                @Override // wn0.a
                public final Object invoke() {
                    return Long.valueOf(d.a.e(percent, context));
                }
            };
            return this;
        }
    }

    /* JADX INFO: renamed from: mc.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lmc/d$b;", "", "", Action.KEY_ATTRIBUTE, "", "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getKey", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> extras;

        public Key(String str, Map<String, String> map) {
            this.key = str;
            this.extras = yc.d.d(map);
        }

        public final Map<String, String> a() {
            return this.extras;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return s.f(this.key, key.key) && s.f(this.extras, key.extras);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.extras.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.key + ", extras=" + this.extras + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: renamed from: mc.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmc/d$c;", "", "Lec/n;", "image", "", "", "extras", "<init>", "(Lec/n;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lec/n;", "b", "()Lec/n;", "Ljava/util/Map;", "()Ljava/util/Map;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Value {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n image;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, Object> extras;

        public Value(n nVar, Map<String, ? extends Object> map) {
            this.image = nVar;
            this.extras = yc.d.d(map);
        }

        public final Map<String, Object> a() {
            return this.extras;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n getImage() {
            return this.image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return s.f(this.image, value.image) && s.f(this.extras, value.extras);
        }

        public int hashCode() {
            return (this.image.hashCode() * 31) + this.extras.hashCode();
        }

        public String toString() {
            return "Value(image=" + this.image + ", extras=" + this.extras + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    Value a(Key key);

    void clear();

    void d(long size);

    void e(Key key, Value value);

    long getSize();
}
