package o4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o4.o0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\u001fB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lo4/o0;", "", "Li4/d;", "annotatedString", "Li4/p0;", "selection", "composition", "<init>", "(Li4/d;JLi4/p0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "text", "(Ljava/lang/String;JLi4/p0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Li4/d;JLi4/p0;)Lo4/o0;", "b", "(Ljava/lang/String;JLi4/p0;)Lo4/o0;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Li4/d;", "e", "()Li4/d;", "J", "g", "()J", "c", "Li4/p0;", "f", "()Li4/p0;", "h", DateTokenConverter.CONVERTER_KEY, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldValue {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a3.j<TextFieldValue, Object> f96451e = a3.k.a(a.f96455c, b.f96456c);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final i4.d text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long selection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i4.p0 composition;

    /* JADX INFO: renamed from: o4.o0$a */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Lo4/o0;", "it", "", "a", "(La3/l;Lo4/o0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, TextFieldValue, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f96455c = new a();

        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a3.l lVar, TextFieldValue textFieldValue) {
            return p013kotlin.collections.v.h(i4.c0.y(textFieldValue.getText(), i4.c0.h(), lVar), i4.c0.y(i4.p0.b(textFieldValue.getSelection()), i4.c0.j(i4.p0.INSTANCE), lVar));
        }
    }

    /* JADX INFO: renamed from: o4.o0$b */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lo4/o0;", "b", "(Ljava/lang/Object;)Lo4/o0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Object, TextFieldValue> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f96456c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextFieldValue invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            a3.j<i4.d, Object> jVarH = i4.c0.h();
            Boolean bool = Boolean.FALSE;
            i4.p0 p0VarA = null;
            i4.d dVarA = ((!p013kotlin.jvm.internal.s.f(obj2, bool) || (jVarH instanceof i4.n)) && obj2 != null) ? jVarH.a(obj2) : null;
            p013kotlin.jvm.internal.s.h(dVarA);
            Object obj3 = list.get(1);
            a3.j<i4.p0, Object> jVarJ = i4.c0.j(i4.p0.INSTANCE);
            if ((!p013kotlin.jvm.internal.s.f(obj3, bool) || (jVarJ instanceof i4.n)) && obj3 != null) {
                p0VarA = jVarJ.a(obj3);
            }
            p013kotlin.jvm.internal.s.h(p0VarA);
            return new TextFieldValue(dVarA, p0VarA.getPackedValue(), (i4.p0) null, 4, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ TextFieldValue(i4.d dVar, long j11, i4.p0 p0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j11, p0Var);
    }

    public static /* synthetic */ TextFieldValue c(TextFieldValue textFieldValue, i4.d dVar, long j11, i4.p0 p0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = textFieldValue.text;
        }
        if ((i11 & 2) != 0) {
            j11 = textFieldValue.selection;
        }
        if ((i11 & 4) != 0) {
            p0Var = textFieldValue.composition;
        }
        return textFieldValue.a(dVar, j11, p0Var);
    }

    public static /* synthetic */ TextFieldValue d(TextFieldValue textFieldValue, String str, long j11, i4.p0 p0Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = textFieldValue.selection;
        }
        if ((i11 & 4) != 0) {
            p0Var = textFieldValue.composition;
        }
        return textFieldValue.b(str, j11, p0Var);
    }

    public final TextFieldValue a(i4.d annotatedString, long selection, i4.p0 composition) {
        return new TextFieldValue(annotatedString, selection, composition, (DefaultConstructorMarker) null);
    }

    public final TextFieldValue b(String text, long selection, i4.p0 composition) {
        return new TextFieldValue(new i4.d(text, null, null, 6, null), selection, composition, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i4.d getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) other;
        return i4.p0.g(this.selection, textFieldValue.selection) && p013kotlin.jvm.internal.s.f(this.composition, textFieldValue.composition) && p013kotlin.jvm.internal.s.f(this.text, textFieldValue.text);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final i4.p0 getComposition() {
        return this.composition;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    public final String h() {
        return this.text.getText();
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + i4.p0.o(this.selection)) * 31;
        i4.p0 p0Var = this.composition;
        return iHashCode + (p0Var != null ? i4.p0.o(p0Var.getPackedValue()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.text) + "', selection=" + ((Object) i4.p0.q(this.selection)) + ", composition=" + this.composition + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ TextFieldValue(String str, long j11, i4.p0 p0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j11, p0Var);
    }

    private TextFieldValue(i4.d dVar, long j11, i4.p0 p0Var) {
        this.text = dVar;
        this.selection = i4.q0.c(j11, 0, h().length());
        this.composition = p0Var != null ? i4.p0.b(i4.q0.c(p0Var.getPackedValue(), 0, h().length())) : null;
    }

    public /* synthetic */ TextFieldValue(i4.d dVar, long j11, i4.p0 p0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i11 & 2) != 0 ? i4.p0.INSTANCE.a() : j11, (i11 & 4) != 0 ? null : p0Var, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j11, i4.p0 p0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? i4.p0.INSTANCE.a() : j11, (i11 & 4) != 0 ? null : p0Var, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private TextFieldValue(String str, long j11, i4.p0 p0Var) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(new i4.d(str, null, null, 6, defaultConstructorMarker), j11, p0Var, defaultConstructorMarker);
    }
}
