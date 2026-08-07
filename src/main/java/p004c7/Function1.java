package p004c7;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: renamed from: c7.c, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Function1;", "", "Ljn0/h0;", "setter", "Lkotlin/Function0;", "getter", "finalPosition", "Lc7/f;", "b", "(Lwn0/l;Lwn0/a;F)Lc7/f;", "Lc7/e;", "a", "(Lwn0/l;Lwn0/a;)Lc7/e;", "dynamicanimation-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class Function1 {

    /* JADX INFO: renamed from: c7.c$a */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"c7/c$a", "Lc7/e;", "", "a", "()F", "value", "Ljn0/h0;", "b", "(F)V", "dynamicanimation-ktx_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.a f18886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f18887c;

        a(wn0.a aVar, l lVar) {
            this.f18886b = aVar;
            this.f18887c = lVar;
        }

        @Override // p004c7.e
        public float a() {
            return ((Number) this.f18886b.invoke()).floatValue();
        }

        @Override // p004c7.e
        public void b(float value) {
            this.f18887c.invoke(Float.valueOf(value));
        }
    }

    private static final e a(l<? super Float, h0> lVar, wn0.a<Float> aVar) {
        return new a(aVar, lVar);
    }

    public static final f b(l<? super Float, h0> setter, wn0.a<Float> getter, float f11) {
        s.l(setter, "setter");
        s.l(getter, "getter");
        e eVarA = a(setter, getter);
        return Float.isNaN(f11) ? new f(eVarA) : new f(eVarA, f11);
    }
}
