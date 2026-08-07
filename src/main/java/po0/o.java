package po0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a_\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a_\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aK\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Output", "", "minDigits", "maxDigits", "spacePadding", "Lpo0/a;", "setter", "", "name", "plusOnExceedsWidth", "Lpo0/p;", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lpo0/a;Ljava/lang/String;Ljava/lang/Integer;)Lpo0/p;", "Target", "", "withMinus", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lpo0/a;Ljava/lang/String;Z)Lpo0/p;", "Object", "Type", "receiver", "value", "position", "nextIndex", "Lpo0/j;", "c", "(Lpo0/a;Ljava/lang/Object;Ljava/lang/Object;II)Ljava/lang/Object;", "kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Object", "Type", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f103506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Type f103507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ po0.a<Object, Type> f103508e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Type type, Type type2, po0.a<? super Object, Type> aVar) {
            super(0);
            this.f103506c = type;
            this.f103507d = type2;
            this.f103508e = aVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Attempting to assign conflicting values '" + this.f103506c + "' and '" + this.f103507d + "' to field '" + this.f103508e.getName() + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    public static final <Output> p<Output> a(Integer num, Integer num2, Integer num3, po0.a<? super Output, Integer> setter, String name, Integer num4) {
        p013kotlin.jvm.internal.s.k(setter, "setter");
        p013kotlin.jvm.internal.s.k(name, "name");
        List listS = v.s(d(num, num2, num3, setter, name, true));
        if (num4 != null) {
            listS.add(e(num, num4, num3, setter, name, false, 32, null));
            listS.add(new p(v.p(new q(Marker.ANY_NON_NULL_MARKER), new h(v.e(new u(Integer.valueOf(num4.intValue() + 1), num2, setter, name, false)))), v.m()));
        } else {
            listS.add(e(num, num2, num3, setter, name, false, 32, null));
        }
        return new p<>(v.m(), listS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <Object, Type> Object c(po0.a<? super Object, Type> aVar, Object object, Type type, int i11, int i12) {
        Type typeC = aVar.c(object, type);
        return typeC == null ? j.INSTANCE.b(i12) : j.INSTANCE.a(i11, new a(typeC, type, aVar));
    }

    public static final <Target> p<Target> d(Integer num, Integer num2, Integer num3, po0.a<? super Target, Integer> setter, String name, boolean z11) {
        int iIntValue;
        p013kotlin.jvm.internal.s.k(setter, "setter");
        p013kotlin.jvm.internal.s.k(name, "name");
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z11 ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z11) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return f(z11, setter, name, iIntValue2, iIntValue);
        }
        p<Target> pVarF = f(z11, setter, name, iIntValue2, iIntValue2);
        while (iIntValue2 < iMin) {
            iIntValue2++;
            pVarF = new p<>(v.m(), v.p(f(z11, setter, name, iIntValue2, iIntValue2), m.b(v.p(new p(v.e(new q(" ")), v.m()), pVarF))));
        }
        if (iIntValue3 > iIntValue) {
            return m.b(v.p(new p(v.e(new q(p013kotlin.text.t.R(" ", iIntValue3 - iIntValue))), v.m()), pVarF));
        }
        return iIntValue3 == iIntValue ? pVarF : new p<>(v.m(), v.p(f(z11, setter, name, iIntValue3 + 1, iIntValue), pVarF));
    }

    public static /* synthetic */ p e(Integer num, Integer num2, Integer num3, po0.a aVar, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            z11 = false;
        }
        return d(num, num2, num3, aVar, str, z11);
    }

    private static final <Target> p<Target> f(boolean z11, po0.a<? super Target, Integer> aVar, String str, int i11, int i12) {
        if (i12 < (z11 ? 1 : 0) + 1) {
            throw new IllegalStateException("Check failed.");
        }
        List listC = v.c();
        if (z11) {
            listC.add(new q("-"));
        }
        listC.add(new h(v.e(new u(Integer.valueOf(i11 - (z11 ? 1 : 0)), Integer.valueOf(i12 - (z11 ? 1 : 0)), aVar, str, z11))));
        return new p<>(v.a(listC), v.m());
    }
}
