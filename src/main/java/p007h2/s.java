package p007h2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.g0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lh2/s;", "", "Lh2/y;", "layout", "Lh2/m;", "a", "(Lh2/y;)Lh2/m;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f70352a;

    /* JADX INFO: renamed from: h2.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lh2/s$a;", "", "<init>", "()V", "Lh2/s;", "b", "Lh2/s;", "l", "()Lh2/s;", "None", "c", "getCharacter", "Character", DateTokenConverter.CONVERTER_KEY, "n", "Word", "e", "m", "Paragraph", "f", "k", "CharacterWithWordAccelerate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f70352a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final s None = new s() { // from class: h2.n
            @Override // p007h2.s
            public final Selection a(y yVar) {
                return s.Companion.h(yVar);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final s Character = new s() { // from class: h2.o
            @Override // p007h2.s
            public final Selection a(y yVar) {
                return s.Companion.f(yVar);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final s Word = new s() { // from class: h2.p
            @Override // p007h2.s
            public final Selection a(y yVar) {
                return s.Companion.j(yVar);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final s Paragraph = new s() { // from class: h2.q
            @Override // p007h2.s
            public final Selection a(y yVar) {
                return s.Companion.i(yVar);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final s CharacterWithWordAccelerate = new s() { // from class: h2.r
            @Override // p007h2.s
            public final Selection a(y yVar) {
                return s.Companion.g(yVar);
            }
        };

        /* JADX INFO: renamed from: h2.s$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh2/l;", "", "it", "Li4/p0;", "a", "(Lh2/l;I)J"}, k = 3, mv = {1, 8, 0})
        static final class C1457a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1457a f70358a = new C1457a();

            C1457a() {
            }

            @Override // p007h2.c
            public final long a(l lVar, int i11) {
                return g0.c(lVar.c(), i11);
            }
        }

        /* JADX INFO: renamed from: h2.s$a$b */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh2/l;", "", "it", "Li4/p0;", "a", "(Lh2/l;I)J"}, k = 3, mv = {1, 8, 0})
        static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f70359a = new b();

            b() {
            }

            @Override // p007h2.c
            public final long a(l lVar, int i11) {
                return lVar.getTextLayoutResult().C(i11);
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection f(y yVar) {
            return t.h(None.a(yVar), yVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection g(y yVar) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo anchorInfoL;
            Selection.AnchorInfo start;
            Selection.AnchorInfo end2;
            Selection selectionE = yVar.e();
            if (selectionE == null) {
                return Word.a(yVar);
            }
            if (yVar.a()) {
                end = selectionE.getStart();
                anchorInfoL = t.l(yVar, yVar.g(), end);
                end2 = selectionE.getEnd();
                start = anchorInfoL;
            } else {
                end = selectionE.getEnd();
                anchorInfoL = t.l(yVar, yVar.f(), end);
                start = selectionE.getStart();
                end2 = anchorInfoL;
            }
            if (p013kotlin.jvm.internal.s.f(anchorInfoL, end)) {
                return selectionE;
            }
            return t.h(new Selection(start, end2, yVar.d() == e.CROSSED || (yVar.d() == e.COLLAPSED && start.getOffset() > end2.getOffset())), yVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection h(y yVar) {
            return new Selection(yVar.g().a(yVar.g().getRawStartHandleOffset()), yVar.f().a(yVar.f().getRawEndHandleOffset()), yVar.d() == e.CROSSED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection i(y yVar) {
            return t.e(yVar, C1457a.f70358a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection j(y yVar) {
            return t.e(yVar, b.f70359a);
        }

        public final s k() {
            return CharacterWithWordAccelerate;
        }

        public final s l() {
            return None;
        }

        public final s m() {
            return Paragraph;
        }

        public final s n() {
            return Word;
        }
    }

    Selection a(y layout);
}
