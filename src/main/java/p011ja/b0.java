package p011ja;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.Address;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b&\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006'()*+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0018\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010 ¨\u0006-"}, d2 = {"Lja/b0;", "T", "", "", "isNullableAllowed", "<init>", "(Z)V", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "h", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "a", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "g", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "e", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/String;", "other", "j", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Z", "c", "()Z", "b", "Ljava/lang/String;", "name", "q", "r", "s", "t", "u", "v", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0<Integer> f83196d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0<Integer> f83197e = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0<int[]> f83198f = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0<List<Integer>> f83199g = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0<Long> f83200h = new l();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b0<long[]> f83201i = new j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b0<List<Long>> f83202j = new k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b0<Float> f83203k = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b0<float[]> f83204l = new d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b0<List<Float>> f83205m = new e();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b0<Boolean> f83206n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b0<boolean[]> f83207o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b0<List<Boolean>> f83208p = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b0<String> f83209q = new p();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b0<String[]> f83210r = new n();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b0<List<String>> f83211s = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isNullableAllowed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name = "nav_type";

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ja/b0$a", "Lja/c;", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[Z)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[Z", "o", "(Ljava/lang/String;)[Z", "previousValue", "p", "(Ljava/lang/String;[Z)[Z", "other", "", "s", "([Z[Z)Z", "", "r", "([Z)Ljava/util/List;", "m", "()[Z", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends p011ja.c<boolean[]> {
        a() {
            super(true);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return "boolean[]";
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean[] k() {
            return new boolean[0];
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean[] a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean[] l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return new boolean[]{b0.f83206n.l(value).booleanValue()};
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean[] g(String value, boolean[] previousValue) {
            boolean[] zArrO;
            p013kotlin.jvm.internal.s.k(value, "value");
            return (previousValue == null || (zArrO = p013kotlin.collections.n.O(previousValue, f(value))) == null) ? f(value) : zArrO;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, boolean[] value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putBooleanArray(key, value);
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(boolean[] value) {
            List<Boolean> listY1;
            if (value == null || (listY1 = p013kotlin.collections.n.y1(value)) == null) {
                return p013kotlin.collections.v.m();
            }
            List<Boolean> list = listY1;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(boolean[] value, boolean[] other) {
            return p013kotlin.collections.n.d(value != null ? p013kotlin.collections.n.T(value) : null, other != null ? p013kotlin.collections.n.T(other) : null);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"ja/b0$b", "Lja/c;", "", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends p011ja.c<List<? extends Boolean>> {
        b() {
            super(true);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return "List<Boolean>";
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<Boolean> k() {
            return p013kotlin.collections.v.m();
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<Boolean> a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            boolean[] zArr = (boolean[]) bundle.get(key);
            if (zArr != null) {
                return p013kotlin.collections.n.y1(zArr);
            }
            return null;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public List<Boolean> l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return p013kotlin.collections.v.e(b0.f83206n.l(value));
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Boolean> g(String value, List<Boolean> previousValue) {
            List<Boolean> listP0;
            p013kotlin.jvm.internal.s.k(value, "value");
            return (previousValue == null || (listP0 = p013kotlin.collections.v.P0(previousValue, f(value))) == null) ? f(value) : listP0;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List<Boolean> value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putBooleanArray(key, value != null ? p013kotlin.collections.v.f1(value) : null);
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(List<Boolean> value) {
            if (value == null) {
                return p013kotlin.collections.v.m();
            }
            List<Boolean> list = value;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List<Boolean> value, List<Boolean> other) {
            return p013kotlin.collections.n.d(value != null ? (Boolean[]) value.toArray(new Boolean[0]) : null, other != null ? (Boolean[]) other.toArray(new Boolean[0]) : null);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ja/b0$c", "Lja/b0;", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "m", "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "l", "(Ljava/lang/String;)Ljava/lang/Boolean;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends b0<Boolean> {
        c() {
            super(false);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return InquiryField.BooleanField.TYPE;
        }

        @Override // p011ja.b0
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Boolean bool) {
            m(bundle, str, bool.booleanValue());
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            return (Boolean) bundle.get(key);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Boolean l(String value) {
            boolean z11;
            p013kotlin.jvm.internal.s.k(value, "value");
            if (p013kotlin.jvm.internal.s.f(value, "true")) {
                z11 = true;
            } else {
                if (!p013kotlin.jvm.internal.s.f(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        public void m(Bundle bundle, String key, boolean value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putBoolean(key, value);
        }
    }

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ja/b0$d", "Lja/c;", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[F)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[F", "o", "(Ljava/lang/String;)[F", "previousValue", "p", "(Ljava/lang/String;[F)[F", "other", "", "s", "([F[F)Z", "", "r", "([F)Ljava/util/List;", "m", "()[F", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends p011ja.c<float[]> {
        d() {
            super(true);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return "float[]";
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public float[] k() {
            return new float[0];
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public float[] a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public float[] l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return new float[]{b0.f83203k.l(value).floatValue()};
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public float[] g(String value, float[] previousValue) {
            float[] fArrI;
            p013kotlin.jvm.internal.s.k(value, "value");
            return (previousValue == null || (fArrI = p013kotlin.collections.n.I(previousValue, f(value))) == null) ? f(value) : fArrI;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, float[] value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putFloatArray(key, value);
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(float[] value) {
            List<Float> listT1;
            if (value == null || (listT1 = p013kotlin.collections.n.t1(value)) == null) {
                return p013kotlin.collections.v.m();
            }
            List<Float> list = listT1;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(float[] value, float[] other) {
            return p013kotlin.collections.n.d(value != null ? p013kotlin.collections.n.U(value) : null, other != null ? p013kotlin.collections.n.U(other) : null);
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ja/b0$e", "Lja/c;", "", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends p011ja.c<List<? extends Float>> {
        e() {
            super(true);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return "List<Float>";
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<Float> k() {
            return p013kotlin.collections.v.m();
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<Float> a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            float[] fArr = (float[]) bundle.get(key);
            if (fArr != null) {
                return p013kotlin.collections.n.t1(fArr);
            }
            return null;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public List<Float> l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return p013kotlin.collections.v.e(b0.f83203k.l(value));
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Float> g(String value, List<Float> previousValue) {
            List<Float> listP0;
            p013kotlin.jvm.internal.s.k(value, "value");
            return (previousValue == null || (listP0 = p013kotlin.collections.v.P0(previousValue, f(value))) == null) ? f(value) : listP0;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List<Float> value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putFloatArray(key, value != null ? p013kotlin.collections.v.j1(value) : null);
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(List<Float> value) {
            if (value == null) {
                return p013kotlin.collections.v.m();
            }
            List<Float> list = value;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List<Float> value, List<Float> other) {
            return p013kotlin.collections.n.d(value != null ? (Float[]) value.toArray(new Float[0]) : null, other != null ? (Float[]) other.toArray(new Float[0]) : null);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ja/b0$f", "Lja/b0;", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "m", "(Landroid/os/Bundle;Ljava/lang/String;F)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Float;", "l", "(Ljava/lang/String;)Ljava/lang/Float;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends b0<Float> {
        f() {
            super(false);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return InquiryField.FloatField.TYPE;
        }

        @Override // p011ja.b0
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Float f11) {
            m(bundle, str, f11.floatValue());
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            Object obj = bundle.get(key);
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Float l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void m(Bundle bundle, String key, float value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putFloat(key, value);
        }
    }

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ja/b0$g", "Lja/c;", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[I)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[I", "o", "(Ljava/lang/String;)[I", "previousValue", "p", "(Ljava/lang/String;[I)[I", "other", "", "s", "([I[I)Z", "", "r", "([I)Ljava/util/List;", "m", "()[I", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g extends p011ja.c<int[]> {
        g() {
            super(true);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return "integer[]";
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public int[] k() {
            return new int[0];
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int[] a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public int[] l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return new int[]{b0.f83196d.l(value).intValue()};
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int[] g(String value, int[] previousValue) {
            int[] iArrK;
            p013kotlin.jvm.internal.s.k(value, "value");
            return (previousValue == null || (iArrK = p013kotlin.collections.n.K(previousValue, f(value))) == null) ? f(value) : iArrK;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, int[] value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putIntArray(key, value);
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(int[] value) {
            List<Integer> listU1;
            if (value == null || (listU1 = p013kotlin.collections.n.u1(value)) == null) {
                return p013kotlin.collections.v.m();
            }
            List<Integer> list = listU1;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(int[] value, int[] other) {
            return p013kotlin.collections.n.d(value != null ? p013kotlin.collections.n.V(value) : null, other != null ? p013kotlin.collections.n.V(other) : null);
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ja/b0$h", "Lja/c;", "", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h extends p011ja.c<List<? extends Integer>> {
        h() {
            super(true);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return "List<Int>";
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<Integer> k() {
            return p013kotlin.collections.v.m();
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<Integer> a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            int[] iArr = (int[]) bundle.get(key);
            if (iArr != null) {
                return p013kotlin.collections.n.u1(iArr);
            }
            return null;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public List<Integer> l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return p013kotlin.collections.v.e(b0.f83196d.l(value));
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Integer> g(String value, List<Integer> previousValue) {
            List<Integer> listP0;
            p013kotlin.jvm.internal.s.k(value, "value");
            return (previousValue == null || (listP0 = p013kotlin.collections.v.P0(previousValue, f(value))) == null) ? f(value) : listP0;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List<Integer> value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putIntArray(key, value != null ? p013kotlin.collections.v.l1(value) : null);
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(List<Integer> value) {
            if (value == null) {
                return p013kotlin.collections.v.m();
            }
            List<Integer> list = value;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List<Integer> value, List<Integer> other) {
            return p013kotlin.collections.n.d(value != null ? (Integer[]) value.toArray(new Integer[0]) : null, other != null ? (Integer[]) other.toArray(new Integer[0]) : null);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ja/b0$i", "Lja/b0;", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "m", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "l", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i extends b0<Integer> {
        i() {
            super(false);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return InquiryField.IntegerField.TYPE;
        }

        @Override // p011ja.b0
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Integer num) {
            m(bundle, str, num.intValue());
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            Object obj = bundle.get(key);
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer l(String value) {
            int i11;
            p013kotlin.jvm.internal.s.k(value, "value");
            if (p013kotlin.text.t.b0(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
                i11 = Integer.parseInt(strSubstring, p013kotlin.text.a.a(16));
            } else {
                i11 = Integer.parseInt(value);
            }
            return Integer.valueOf(i11);
        }

        public void m(Bundle bundle, String key, int value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putInt(key, value);
        }
    }

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ja/b0$j", "Lja/c;", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[J)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "o", "(Ljava/lang/String;)[J", "previousValue", "p", "(Ljava/lang/String;[J)[J", "other", "", "s", "([J[J)Z", "", "r", "([J)Ljava/util/List;", "m", "()[J", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class j extends p011ja.c<long[]> {
        j() {
            super(true);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return "long[]";
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public long[] k() {
            return new long[0];
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public long[] a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public long[] l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return new long[]{b0.f83200h.l(value).longValue()};
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public long[] g(String value, long[] previousValue) {
            long[] jArrL;
            p013kotlin.jvm.internal.s.k(value, "value");
            return (previousValue == null || (jArrL = p013kotlin.collections.n.L(previousValue, f(value))) == null) ? f(value) : jArrL;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, long[] value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putLongArray(key, value);
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(long[] value) {
            List<Long> listV1;
            if (value == null || (listV1 = p013kotlin.collections.n.v1(value)) == null) {
                return p013kotlin.collections.v.m();
            }
            List<Long> list = listV1;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(long[] value, long[] other) {
            return p013kotlin.collections.n.d(value != null ? p013kotlin.collections.n.W(value) : null, other != null ? p013kotlin.collections.n.W(other) : null);
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ja/b0$k", "Lja/c;", "", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k extends p011ja.c<List<? extends Long>> {
        k() {
            super(true);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return "List<Long>";
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<Long> k() {
            return p013kotlin.collections.v.m();
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<Long> a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            long[] jArr = (long[]) bundle.get(key);
            if (jArr != null) {
                return p013kotlin.collections.n.v1(jArr);
            }
            return null;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public List<Long> l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return p013kotlin.collections.v.e(b0.f83200h.l(value));
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Long> g(String value, List<Long> previousValue) {
            List<Long> listP0;
            p013kotlin.jvm.internal.s.k(value, "value");
            return (previousValue == null || (listP0 = p013kotlin.collections.v.P0(previousValue, f(value))) == null) ? f(value) : listP0;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List<Long> value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putLongArray(key, value != null ? p013kotlin.collections.v.n1(value) : null);
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(List<Long> value) {
            if (value == null) {
                return p013kotlin.collections.v.m();
            }
            List<Long> list = value;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List<Long> value, List<Long> other) {
            return p013kotlin.collections.n.d(value != null ? (Long[]) value.toArray(new Long[0]) : null, other != null ? (Long[]) other.toArray(new Long[0]) : null);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ja/b0$l", "Lja/b0;", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "m", "(Landroid/os/Bundle;Ljava/lang/String;J)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "l", "(Ljava/lang/String;)Ljava/lang/Long;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l extends b0<Long> {
        l() {
            super(false);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return "long";
        }

        @Override // p011ja.b0
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Long l11) {
            m(bundle, str, l11.longValue());
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Long a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            Object obj = bundle.get(key);
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Long l(String value) {
            String strSubstring;
            long j11;
            p013kotlin.jvm.internal.s.k(value, "value");
            if (p013kotlin.text.t.L(value, "L", false, 2, null)) {
                strSubstring = value.substring(0, value.length() - 1);
                p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            } else {
                strSubstring = value;
            }
            if (p013kotlin.text.t.b0(value, "0x", false, 2, null)) {
                String strSubstring2 = strSubstring.substring(2);
                p013kotlin.jvm.internal.s.j(strSubstring2, "substring(...)");
                j11 = Long.parseLong(strSubstring2, p013kotlin.text.a.a(16));
            } else {
                j11 = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j11);
        }

        public void m(Bundle bundle, String key, long value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putLong(key, value);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ja/b0$m", "Lja/b0;", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "m", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "l", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class m extends b0<Integer> {
        m() {
            super(false);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return "reference";
        }

        @Override // p011ja.b0
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Integer num) {
            m(bundle, str, num.intValue());
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            Object obj = bundle.get(key);
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer l(String value) {
            int i11;
            p013kotlin.jvm.internal.s.k(value, "value");
            if (p013kotlin.text.t.b0(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
                i11 = Integer.parseInt(strSubstring, p013kotlin.text.a.a(16));
            } else {
                i11 = Integer.parseInt(value);
            }
            return Integer.valueOf(i11);
        }

        public void m(Bundle bundle, String key, int value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putInt(key, value);
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ja/b0$n", "Lja/c;", "", "", "Landroid/os/Bundle;", "bundle", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "o", "(Ljava/lang/String;)[Ljava/lang/String;", "previousValue", "p", "(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;", "other", "", "s", "([Ljava/lang/String;[Ljava/lang/String;)Z", "", "r", "([Ljava/lang/String;)Ljava/util/List;", "m", "()[Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class n extends p011ja.c<String[]> {
        n() {
            super(true);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return "string[]";
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public String[] k() {
            return new String[0];
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String[] a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String[] l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return new String[]{value};
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public String[] g(String value, String[] previousValue) {
            String[] strArr;
            p013kotlin.jvm.internal.s.k(value, "value");
            return (previousValue == null || (strArr = (String[]) p013kotlin.collections.n.N(previousValue, f(value))) == null) ? f(value) : strArr;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, String[] value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putStringArray(key, value);
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(String[] value) {
            if (value == null) {
                return p013kotlin.collections.v.m();
            }
            ArrayList arrayList = new ArrayList(value.length);
            for (String str : value) {
                arrayList.add(Uri.encode(str));
            }
            return arrayList;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(String[] value, String[] other) {
            return p013kotlin.collections.n.d(value, other);
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"ja/b0$o", "Lja/c;", "", "", "Landroid/os/Bundle;", "bundle", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class o extends p011ja.c<List<? extends String>> {
        o() {
            super(true);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return "List<String>";
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<String> k() {
            return p013kotlin.collections.v.m();
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<String> a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            String[] strArr = (String[]) bundle.get(key);
            if (strArr != null) {
                return p013kotlin.collections.n.w1(strArr);
            }
            return null;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public List<String> l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return p013kotlin.collections.v.e(value);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<String> g(String value, List<String> previousValue) {
            List<String> listP0;
            p013kotlin.jvm.internal.s.k(value, "value");
            return (previousValue == null || (listP0 = p013kotlin.collections.v.P0(previousValue, f(value))) == null) ? f(value) : listP0;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List<String> value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putStringArray(key, value != null ? (String[]) value.toArray(new String[0]) : null);
        }

        @Override // p011ja.c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(List<String> value) {
            if (value == null) {
                return p013kotlin.collections.v.m();
            }
            List<String> list = value;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.encode((String) it.next()));
            }
            return arrayList;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List<String> value, List<String> other) {
            return p013kotlin.collections.n.d(value != null ? (String[]) value.toArray(new String[0]) : null, other != null ? (String[]) other.toArray(new String[0]) : null);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\"\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ja/b0$p", "Lja/b0;", "", "Landroid/os/Bundle;", "bundle", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "m", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "l", "(Ljava/lang/String;)Ljava/lang/String;", "n", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class p extends b0<String> {
        p() {
            super(true);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            return InquiryField.StringField.TYPE;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            return (String) bundle.get(key);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public String l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            if (p013kotlin.jvm.internal.s.f(value, Address.ADDRESS_NULL_PLACEHOLDER)) {
                return null;
            }
            return value;
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, String value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            bundle.putString(key, value);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String i(String value) {
            String strEncode = value != null ? Uri.encode(value) : null;
            return strEncode == null ? Address.ADDRESS_NULL_PLACEHOLDER : strEncode;
        }
    }

    /* JADX INFO: renamed from: ja.b0$q, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b0\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000b0\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000b0\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\nR\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u000b0\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\nR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Lja/b0$q;", "", "<init>", "()V", "value", "Lja/b0;", "a", "(Ljava/lang/Object;)Lja/b0;", "", "BoolArrayType", "Lja/b0;", "", "", "BoolListType", "BoolType", "", "FloatArrayType", "", "FloatListType", "FloatType", "", "IntArrayType", "", "IntListType", "IntType", "", "LongArrayType", "", "LongListType", "LongType", "ReferenceType", "", "", "StringArrayType", "StringListType", "StringType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b0<Object> a(Object value) {
            if (value instanceof Integer) {
                b0<Integer> b0Var = b0.f83196d;
                p013kotlin.jvm.internal.s.i(b0Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return b0Var;
            }
            if (value instanceof int[]) {
                b0<int[]> b0Var2 = b0.f83198f;
                p013kotlin.jvm.internal.s.i(b0Var2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return b0Var2;
            }
            if (value instanceof Long) {
                b0<Long> b0Var3 = b0.f83200h;
                p013kotlin.jvm.internal.s.i(b0Var3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return b0Var3;
            }
            if (value instanceof long[]) {
                b0<long[]> b0Var4 = b0.f83201i;
                p013kotlin.jvm.internal.s.i(b0Var4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return b0Var4;
            }
            if (value instanceof Float) {
                b0<Float> b0Var5 = b0.f83203k;
                p013kotlin.jvm.internal.s.i(b0Var5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return b0Var5;
            }
            if (value instanceof float[]) {
                b0<float[]> b0Var6 = b0.f83204l;
                p013kotlin.jvm.internal.s.i(b0Var6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return b0Var6;
            }
            if (value instanceof Boolean) {
                b0<Boolean> b0Var7 = b0.f83206n;
                p013kotlin.jvm.internal.s.i(b0Var7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return b0Var7;
            }
            if (value instanceof boolean[]) {
                b0<boolean[]> b0Var8 = b0.f83207o;
                p013kotlin.jvm.internal.s.i(b0Var8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return b0Var8;
            }
            if ((value instanceof String) || value == null) {
                b0<String> b0Var9 = b0.f83209q;
                p013kotlin.jvm.internal.s.i(b0Var9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return b0Var9;
            }
            if ((value instanceof Object[]) && (((Object[]) value) instanceof String[])) {
                b0<String[]> b0Var10 = b0.f83210r;
                p013kotlin.jvm.internal.s.i(b0Var10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return b0Var10;
            }
            if (value.getClass().isArray()) {
                Class<?> componentType = value.getClass().getComponentType();
                p013kotlin.jvm.internal.s.h(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = value.getClass().getComponentType();
                    p013kotlin.jvm.internal.s.i(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new s(componentType2);
                }
            }
            if (value.getClass().isArray()) {
                Class<?> componentType3 = value.getClass().getComponentType();
                p013kotlin.jvm.internal.s.h(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = value.getClass().getComponentType();
                    p013kotlin.jvm.internal.s.i(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new u(componentType4);
                }
            }
            if (value instanceof Parcelable) {
                return new t(value.getClass());
            }
            if (value instanceof Enum) {
                return new r(value.getClass());
            }
            if (value instanceof Serializable) {
                return new v(value.getClass());
            }
            throw new IllegalArgumentException("Object of type " + value.getClass().getName() + " is not supported for navigation arguments.");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lja/b0$r;", "", "D", "Lja/b0$v;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "value", "n", "(Ljava/lang/String;)Ljava/lang/Enum;", "u", "Ljava/lang/Class;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class r<D extends Enum<?>> extends v<D> {

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Class<D> type) {
            super(false, type);
            p013kotlin.jvm.internal.s.k(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // ja.b0.v, p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            String name = this.type.getName();
            p013kotlin.jvm.internal.s.j(name, "type.name");
            return name;
        }

        @Override // ja.b0.v
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D l(String value) {
            D d11;
            p013kotlin.jvm.internal.s.k(value, "value");
            D[] enumConstants = this.type.getEnumConstants();
            p013kotlin.jvm.internal.s.j(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    d11 = null;
                    break;
                }
                d11 = enumConstants[i11];
                if (p013kotlin.text.t.M(d11.name(), value, true)) {
                    break;
                }
                i11++;
            }
            D d12 = d11;
            if (d12 != null) {
                return d12;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.type.getName() + CoreConstants.DOT);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00172\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lja/b0$s;", "Landroid/os/Parcelable;", "D", "Lja/b0;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "m", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "l", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "n", "([Landroid/os/Parcelable;[Landroid/os/Parcelable;)Z", "t", "Ljava/lang/Class;", "arrayType", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class s<D extends Parcelable> extends b0<D[]> {

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Class<D> type) {
            super(true);
            p013kotlin.jvm.internal.s.k(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                p013kotlin.jvm.internal.s.i(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.arrayType = cls;
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            String name = this.arrayType.getName();
            p013kotlin.jvm.internal.s.j(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !p013kotlin.jvm.internal.s.f(s.class, other.getClass())) {
                return false;
            }
            return p013kotlin.jvm.internal.s.f(this.arrayType, ((s) other).arrayType);
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public D[] a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // p011ja.b0
        public D[] l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, D[] value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            this.arrayType.cast(value);
            bundle.putParcelableArray(key, value);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean j(D[] value, D[] other) {
            return p013kotlin.collections.n.d(value, other);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lja/b0$t;", "D", "Lja/b0;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "h", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "a", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "t", "Ljava/lang/Class;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class t<D> extends b0<D> {

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Class<D> type) {
            super(true);
            p013kotlin.jvm.internal.s.k(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // p011ja.b0
        public D a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            return (D) bundle.get(key);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            String name = this.type.getName();
            p013kotlin.jvm.internal.s.j(name, "type.name");
            return name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !p013kotlin.jvm.internal.s.f(t.class, other.getClass())) {
                return false;
            }
            return p013kotlin.jvm.internal.s.f(this.type, ((t) other).type);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: f */
        public D l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // p011ja.b0
        public void h(Bundle bundle, String key, D value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            this.type.cast(value);
            if (value == null || (value instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) value);
            } else if (value instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) value);
            }
        }

        public int hashCode() {
            return this.type.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00172\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lja/b0$u;", "Ljava/io/Serializable;", "D", "Lja/b0;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "m", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "l", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "n", "([Ljava/io/Serializable;[Ljava/io/Serializable;)Z", "t", "Ljava/lang/Class;", "arrayType", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class u<D extends Serializable> extends b0<D[]> {

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Class<D> type) {
            super(true);
            p013kotlin.jvm.internal.s.k(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                p013kotlin.jvm.internal.s.i(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.arrayType = cls;
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            String name = this.arrayType.getName();
            p013kotlin.jvm.internal.s.j(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !p013kotlin.jvm.internal.s.f(u.class, other.getClass())) {
                return false;
            }
            return p013kotlin.jvm.internal.s.f(this.arrayType, ((u) other).arrayType);
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public D[] a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // p011ja.b0
        public D[] l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p011ja.b0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, D[] value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            this.arrayType.cast(value);
            bundle.putSerializable(key, value);
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean j(D[] value, D[] other) {
            return p013kotlin.collections.n.d(value, other);
        }
    }

    public b0(boolean z11) {
        this.isNullableAllowed = z11;
    }

    public abstract T a(Bundle bundle, String key);

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getIsNullableAllowed() {
        return this.isNullableAllowed;
    }

    public final T d(Bundle bundle, String key, String value) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(value, "value");
        T tL = l(value);
        h(bundle, key, tL);
        return tL;
    }

    public final T e(Bundle bundle, String key, String value, T previousValue) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (value == null) {
            return previousValue;
        }
        T tG = g(value, previousValue);
        h(bundle, key, tG);
        return tG;
    }

    /* JADX INFO: renamed from: f */
    public abstract T l(String value);

    public T g(String value, T previousValue) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return l(value);
    }

    public abstract void h(Bundle bundle, String key, T value);

    public String i(T value) {
        return String.valueOf(value);
    }

    public boolean j(T value, T other) {
        return p013kotlin.jvm.internal.s.f(value, other);
    }

    public String toString() {
        return getName();
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lja/b0$v;", "Ljava/io/Serializable;", "D", "Lja/b0;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "nullableAllowed", "(ZLjava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "m", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "l", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "t", "Ljava/lang/Class;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class v<D extends Serializable> extends b0<D> {

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Class<D> type) {
            super(true);
            p013kotlin.jvm.internal.s.k(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: b */
        public String getName() {
            String name = this.type.getName();
            p013kotlin.jvm.internal.s.j(name, "type.name");
            return name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof v) {
                return p013kotlin.jvm.internal.s.f(this.type, ((v) other).type);
            }
            return false;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public D a(Bundle bundle, String key) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            return (D) bundle.get(key);
        }

        @Override // p011ja.b0
        public D l(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // p011ja.b0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, D value) {
            p013kotlin.jvm.internal.s.k(bundle, "bundle");
            p013kotlin.jvm.internal.s.k(key, "key");
            p013kotlin.jvm.internal.s.k(value, "value");
            this.type.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z11, Class<D> type) {
            super(z11);
            p013kotlin.jvm.internal.s.k(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
