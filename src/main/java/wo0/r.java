package wo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.annotation.Annotation;
import java.util.List;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0012\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Luo0/f;", "encoder", "Ljn0/h0;", "h", "(Luo0/f;)V", "Luo0/e;", "decoder", "g", "(Luo0/e;)V", "Lwo0/h;", DateTokenConverter.CONVERTER_KEY, "(Luo0/e;)Lwo0/h;", "Lwo0/s;", "e", "(Luo0/f;)Lwo0/s;", "Lkotlin/Function0;", "Lto0/f;", "deferred", "f", "(Lwn0/a;)Lto0/f;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r {

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"wo0/r$a", "Lto0/f;", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "g", "(I)Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "(I)Lto0/f;", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Z", "a", "Lkotlin/Lazy;", "()Lto0/f;", "original", "h", "()Ljava/lang/String;", "serialName", "Lto0/n;", "getKind", "()Lto0/n;", "kind", "e", "()I", "elementsCount", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements to0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Lazy original;

        a(wn0.a<? extends to0.f> aVar) {
            this.original = jn0.m.b(aVar);
        }

        private final to0.f a() {
            return (to0.f) this.original.getValue();
        }

        @Override // to0.f
        public boolean b() {
            return to0.f.a.c(this);
        }

        @Override // to0.f
        public int c(String name) {
            p013kotlin.jvm.internal.s.k(name, "name");
            return a().c(name);
        }

        @Override // to0.f
        public to0.f d(int index) {
            return a().d(index);
        }

        @Override // to0.f
        /* JADX INFO: renamed from: e */
        public int getElementsCount() {
            return a().getElementsCount();
        }

        @Override // to0.f
        public String f(int index) {
            return a().f(index);
        }

        @Override // to0.f
        public List<Annotation> g(int index) {
            return a().g(index);
        }

        @Override // to0.f
        public List<Annotation> getAnnotations() {
            return to0.f.a.a(this);
        }

        @Override // to0.f
        public to0.n getKind() {
            return a().getKind();
        }

        @Override // to0.f
        /* JADX INFO: renamed from: h */
        public String getSerialName() {
            return a().getSerialName();
        }

        @Override // to0.f
        public boolean i(int index) {
            return a().i(index);
        }

        @Override // to0.f
        /* JADX INFO: renamed from: isInline */
        public boolean getIsInline() {
            return to0.f.a.b(this);
        }
    }

    public static final h d(uo0.e eVar) {
        p013kotlin.jvm.internal.s.k(eVar, "<this>");
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + o0.b(eVar.getClass()));
    }

    public static final s e(uo0.f fVar) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        s sVar = fVar instanceof s ? (s) fVar : null;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + o0.b(fVar.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to0.f f(wn0.a<? extends to0.f> aVar) {
        return new a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(uo0.e eVar) {
        d(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(uo0.f fVar) {
        e(fVar);
    }
}
