package po0;

import ch.qos.logback.core.CoreConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Lpo0/q;", "Output", "Lpo0/n;", "", InquiryField.StringField.TYPE, "<init>", "(Ljava/lang/String;)V", PlaceTypes.STORAGE, "", "input", "", "startIndex", "Lpo0/j;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "b", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q<Output> implements n<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String string;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q<Output> f103512c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q<Output> qVar) {
            super(0);
            this.f103512c = qVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unexpected end of input: yet to parse '" + this.f103512c.getString() + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q<Output> f103513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CharSequence f103514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f103515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f103516f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q<Output> qVar, CharSequence charSequence, int i11, int i12) {
            super(0);
            this.f103513c = qVar;
            this.f103514d = charSequence;
            this.f103515e = i11;
            this.f103516f = i12;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected ");
            sb2.append(this.f103513c.getString());
            sb2.append(" but got ");
            CharSequence charSequence = this.f103514d;
            int i11 = this.f103515e;
            sb2.append(charSequence.subSequence(i11, this.f103516f + i11 + 1).toString());
            return sb2.toString();
        }
    }

    public q(String string) {
        p013kotlin.jvm.internal.s.k(string, "string");
        this.string = string;
        if (string.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (mo0.d.b(string.charAt(0))) {
            throw new IllegalArgumentException(("String '" + string + "' starts with a digit").toString());
        }
        if (mo0.d.b(string.charAt(string.length() - 1))) {
            throw new IllegalArgumentException(("String '" + string + "' ends with a digit").toString());
        }
    }

    @Override // po0.n
    public Object a(Output storage, CharSequence input, int startIndex) {
        p013kotlin.jvm.internal.s.k(input, "input");
        if (this.string.length() + startIndex > input.length()) {
            return j.INSTANCE.a(startIndex, new a(this));
        }
        int length = this.string.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (input.charAt(startIndex + i11) != this.string.charAt(i11)) {
                return j.INSTANCE.a(startIndex, new b(this, input, startIndex, i11));
            }
        }
        return j.INSTANCE.b(startIndex + this.string.length());
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getString() {
        return this.string;
    }

    public String toString() {
        return CoreConstants.SINGLE_QUOTE_CHAR + this.string + CoreConstants.SINGLE_QUOTE_CHAR;
    }
}
