package no0;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: no0.y, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lno0/y;", "T", "Lno0/s;", "Lno0/o;", "format", "", "withPlusSign", "<init>", "(Lno0/o;Z)V", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lpo0/p;", "b", "()Lpo0/p;", "Loo0/e;", "a", "()Loo0/e;", "Lno0/o;", "f", "()Lno0/o;", "Z", "getWithPlusSign", "()Z", "", "Lno0/m;", "c", "Ljava/util/Set;", "fieldSigns", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SignedFormatStructure<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o<T> format;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean withPlusSign;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<m<T>> fieldSigns;

    /* JADX INFO: renamed from: no0.y$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l<T, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SignedFormatStructure<T> f95277a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(SignedFormatStructure<? super T> signedFormatStructure) {
            super(1, kotlin.jvm.internal.s.a.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
            this.f95277a = signedFormatStructure;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t11) {
            return Boolean.valueOf(SignedFormatStructure.e(this.f95277a, t11));
        }
    }

    /* JADX INFO: renamed from: no0.y$b */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0000 \u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "value", "", "isNegative", "Ljn0/h0;", "a", "(Ljava/lang/Object;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<T, Boolean, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SignedFormatStructure<T> f95278c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(SignedFormatStructure<? super T> signedFormatStructure) {
            super(2);
            this.f95278c = signedFormatStructure;
        }

        public final void a(T t11, boolean z11) {
            for (m mVar : ((SignedFormatStructure) this.f95278c).fieldSigns) {
                mVar.isNegative().c(t11, Boolean.valueOf(z11 != p013kotlin.jvm.internal.s.f(mVar.isNegative().a(t11), Boolean.TRUE)));
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(Object obj, Boolean bool) {
            a(obj, bool.booleanValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SignedFormatStructure(o<? super T> format, boolean z11) {
        p013kotlin.jvm.internal.s.k(format, "format");
        this.format = format;
        this.withPlusSign = z11;
        List listB = p.b(format);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            m mVarB = ((l) it.next()).c().b();
            if (mVarB != null) {
                arrayList.add(mVarB);
            }
        }
        Set<m<T>> setR1 = p013kotlin.collections.v.r1(arrayList);
        this.fieldSigns = setR1;
        if (setR1.isEmpty()) {
            throw new IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean e(SignedFormatStructure<? super T> signedFormatStructure, T t11) {
        boolean z11 = false;
        for (m<? super T> mVar : ((SignedFormatStructure) signedFormatStructure).fieldSigns) {
            if (p013kotlin.jvm.internal.s.f(mVar.isNegative().a(t11), Boolean.TRUE)) {
                z11 = true;
            } else if (!mVar.a(t11)) {
                return false;
            }
        }
        return z11;
    }

    @Override // no0.o
    public oo0.e<T> a() {
        return new oo0.f(this.format.a(), new a(this), this.withPlusSign);
    }

    @Override // no0.o
    public po0.p<T> b() {
        return po0.m.b(p013kotlin.collections.v.p(new po0.p(p013kotlin.collections.v.e(new po0.r(new b(this), this.withPlusSign, "sign for " + this.fieldSigns)), p013kotlin.collections.v.m()), this.format.b()));
    }

    public boolean equals(Object other) {
        if (!(other instanceof SignedFormatStructure)) {
            return false;
        }
        SignedFormatStructure signedFormatStructure = (SignedFormatStructure) other;
        return p013kotlin.jvm.internal.s.f(this.format, signedFormatStructure.format) && this.withPlusSign == signedFormatStructure.withPlusSign;
    }

    public final o<T> f() {
        return this.format;
    }

    public int hashCode() {
        return (this.format.hashCode() * 31) + Boolean.hashCode(this.withPlusSign);
    }

    public String toString() {
        return "SignedFormatStructure(" + this.format + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
