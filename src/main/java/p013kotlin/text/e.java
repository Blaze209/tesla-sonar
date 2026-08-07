package p013kotlin.text;

import bo0.j;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ho0.i;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012&\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R4\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/text/e;", "Lho0/i;", "Lbo0/j;", "", "input", "", "startIndex", "limit", "Lkotlin/Function2;", "Lkotlin/Pair;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILwn0/p;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/lang/CharSequence;", "b", "I", "c", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e implements i<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence input;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int limit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p<CharSequence, Integer, Pair<Integer, Integer>> getNextMatch;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u0006#"}, d2 = {"kotlin/text/e$a", "", "Lbo0/j;", "Ljn0/h0;", "b", "()V", DateTokenConverter.CONVERTER_KEY, "()Lbo0/j;", "", "hasNext", "()Z", "", "a", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", "c", "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", "Lbo0/j;", "getNextItem", "setNextItem", "(Lbo0/j;)V", "nextItem", "e", "getCounter", "setCounter", "counter", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Iterator<j>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int nextState = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int currentStartIndex;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int nextSearchIndex;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private j nextItem;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int counter;

        a() {
            int iN = n.n(e.this.startIndex, 0, e.this.input.length());
            this.currentStartIndex = iN;
            this.nextSearchIndex = iN;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:12:0x0030 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0097  */
        private final void b() {
            Pair pair;
            if (this.nextSearchIndex < 0) {
                this.nextState = 0;
                this.nextItem = null;
                return;
            }
            if (e.this.limit > 0) {
                int i11 = this.counter + 1;
                this.counter = i11;
                if (i11 >= e.this.limit) {
                    this.nextItem = new j(this.currentStartIndex, i0.p0(e.this.input));
                    this.nextSearchIndex = -1;
                } else if (this.nextSearchIndex > e.this.input.length() && (pair = (Pair) e.this.getNextMatch.invoke(e.this.input, Integer.valueOf(this.nextSearchIndex))) != null) {
                    int iIntValue = ((Number) pair.a()).intValue();
                    int iIntValue2 = ((Number) pair.b()).intValue();
                    this.nextItem = n.w(this.currentStartIndex, iIntValue);
                    int i12 = iIntValue + iIntValue2;
                    this.currentStartIndex = i12;
                    this.nextSearchIndex = i12 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.nextItem = new j(this.currentStartIndex, i0.p0(e.this.input));
                    this.nextSearchIndex = -1;
                }
            } else if (this.nextSearchIndex > e.this.input.length()) {
                this.nextItem = new j(this.currentStartIndex, i0.p0(e.this.input));
                this.nextSearchIndex = -1;
            } else {
                int iIntValue3 = ((Number) pair.a()).intValue();
                int iIntValue4 = ((Number) pair.b()).intValue();
                this.nextItem = n.w(this.currentStartIndex, iIntValue3);
                int i13 = iIntValue3 + iIntValue4;
                this.currentStartIndex = i13;
                this.nextSearchIndex = i13 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.nextState = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public j next() {
            if (this.nextState == -1) {
                b();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            j jVar = this.nextItem;
            s.i(jVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.nextItem = null;
            this.nextState = -1;
            return jVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                b();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence input, int i11, int i12, p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
        s.k(input, "input");
        s.k(getNextMatch, "getNextMatch");
        this.input = input;
        this.startIndex = i11;
        this.limit = i12;
        this.getNextMatch = getNextMatch;
    }

    @Override // ho0.i
    public Iterator<j> iterator() {
        return new a();
    }
}
