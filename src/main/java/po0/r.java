package po0;

import com.google.android.libraries.places.api.model.PlaceTypes;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Lpo0/r;", "Output", "Lpo0/n;", "Lkotlin/Function2;", "", "Ljn0/h0;", "isNegativeSetter", "withPlusSign", "", "whatThisExpects", "<init>", "(Lwn0/p;ZLjava/lang/String;)V", PlaceTypes.STORAGE, "", "input", "", "startIndex", "Lpo0/j;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "Lwn0/p;", "b", "Z", "c", "Ljava/lang/String;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r<Output> implements n<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<Output, Boolean, h0> isNegativeSetter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean withPlusSign;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String whatThisExpects;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r<Output> f103520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ char f103521d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r<Output> rVar, char c11) {
            super(0);
            this.f103520c = rVar;
            this.f103521d = c11;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Expected " + ((r) this.f103520c).whatThisExpects + " but got " + this.f103521d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(wn0.p<? super Output, ? super Boolean, h0> isNegativeSetter, boolean z11, String whatThisExpects) {
        p013kotlin.jvm.internal.s.k(isNegativeSetter, "isNegativeSetter");
        p013kotlin.jvm.internal.s.k(whatThisExpects, "whatThisExpects");
        this.isNegativeSetter = isNegativeSetter;
        this.withPlusSign = z11;
        this.whatThisExpects = whatThisExpects;
    }

    @Override // po0.n
    public Object a(Output storage, CharSequence input, int startIndex) {
        p013kotlin.jvm.internal.s.k(input, "input");
        if (startIndex >= input.length()) {
            return j.INSTANCE.b(startIndex);
        }
        char cCharAt = input.charAt(startIndex);
        if (cCharAt == '-') {
            this.isNegativeSetter.invoke(storage, Boolean.TRUE);
            return j.INSTANCE.b(startIndex + 1);
        }
        if (cCharAt != '+' || !this.withPlusSign) {
            return j.INSTANCE.a(startIndex, new a(this, cCharAt));
        }
        this.isNegativeSetter.invoke(storage, Boolean.FALSE);
        return j.INSTANCE.b(startIndex + 1);
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getWhatThisExpects() {
        return this.whatThisExpects;
    }
}
