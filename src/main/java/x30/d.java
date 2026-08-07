package x30;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u001a/\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\b2\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0005\"\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0005\"\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00020\r*\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0087\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u001b\u001a\u00020\r*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0015\u0010\u001b\u001a\u00020\r*\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "", "args", "", "h", "(Landroid/content/Context;Ljava/util/List;)[Ljava/lang/Object;", "", "id", "formatArgs", "Ly30/b;", "transformations", "Lx30/c;", "e", "(I[Ljava/lang/Object;Ljava/util/List;)Lx30/c;", "", "value", "f", "(Ljava/lang/String;[Ljava/lang/Object;)Lx30/c;", "c", "(Lx30/c;)Lx30/c;", "other", DateTokenConverter.CONVERTER_KEY, "(Lx30/c;Lx30/c;)Lx30/c;", "b", "(Ljava/lang/String;)Lx30/c;", "resolvableString", "a", "(I)Lx30/c;", "stripe-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {
    public static final c a(int i11) {
        return new IdentifierResolvableString(i11, v.m(), v.m());
    }

    public static final c b(String str) {
        s.k(str, "<this>");
        return new StaticResolvableString(str, v.m());
    }

    public static final c c(c cVar) {
        return cVar == null ? b("") : cVar;
    }

    public static final c d(c cVar, c other) {
        s.k(cVar, "<this>");
        s.k(other, "other");
        return new ConcatenatedResolvableString(cVar, other);
    }

    public static final c e(int i11, Object[] formatArgs, List<? extends y30.b> transformations) {
        s.k(formatArgs, "formatArgs");
        s.k(transformations, "transformations");
        return new IdentifierResolvableString(i11, transformations, n.w1(formatArgs));
    }

    public static final c f(String value, Object... formatArgs) {
        s.k(value, "value");
        s.k(formatArgs, "formatArgs");
        return new StaticResolvableString(value, n.w1(formatArgs));
    }

    public static /* synthetic */ c g(int i11, Object[] objArr, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            list = v.m();
        }
        return e(i11, objArr, list);
    }

    public static final Object[] h(Context context, List<? extends Object> args) {
        s.k(context, "context");
        s.k(args, "args");
        List<? extends Object> list = args;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (Object objB2 : list) {
            if (objB2 instanceof c) {
                objB2 = ((c) objB2).B2(context);
            }
            arrayList.add(objB2);
        }
        return arrayList.toArray(new Object[0]);
    }
}
