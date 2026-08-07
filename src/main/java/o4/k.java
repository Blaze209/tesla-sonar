package o4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R$\u0010!\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lo4/k;", "", "<init>", "()V", "", "Lo4/i;", "editCommands", "failedCommand", "", "c", "(Ljava/util/List;Lo4/i;)Ljava/lang/String;", "e", "(Lo4/i;)Ljava/lang/String;", "Lo4/o0;", "value", "Lo4/w0;", "textInputSession", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lo4/o0;Lo4/w0;)V", "b", "(Ljava/util/List;)Lo4/o0;", "f", "()Lo4/o0;", "<set-?>", "a", "Lo4/o0;", "getMBufferState$ui_text_release", "mBufferState", "Lo4/l;", "Lo4/l;", "getMBuffer$ui_text_release", "()Lo4/l;", "mBuffer", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue mBufferState = new TextFieldValue(i4.e.g(), i4.p0.INSTANCE.a(), (i4.p0) null, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private l mBuffer = new l(this.mBufferState.getText(), this.mBufferState.getSelection(), null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/i;", "it", "", "a", "(Lo4/i;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<i, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f96423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f96424d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, k kVar) {
            super(1);
            this.f96423c = iVar;
            this.f96424d = kVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(i iVar) {
            return (this.f96423c == iVar ? " > " : "   ") + this.f96424d.e(iVar);
        }
    }

    private final String c(List<? extends i> editCommands, i failedCommand) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.h() + ", composition=" + this.mBuffer.d() + ", selection=" + ((Object) i4.p0.q(this.mBuffer.i())) + "):");
        p013kotlin.jvm.internal.s.j(sb2, "append(value)");
        sb2.append('\n');
        p013kotlin.jvm.internal.s.j(sb2, "append('\\n')");
        p013kotlin.collections.g0.v0(editCommands, sb2, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new a(failedCommand, this));
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(i iVar) {
        if (iVar instanceof CommitTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) iVar;
            sb2.append(commitTextCommand.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(commitTextCommand.getNewCursorPosition());
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb2.toString();
        }
        if (iVar instanceof SetComposingTextCommand) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) iVar;
            sb3.append(setComposingTextCommand.c().length());
            sb3.append(", newCursorPosition=");
            sb3.append(setComposingTextCommand.getNewCursorPosition());
            sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb3.toString();
        }
        if (iVar instanceof SetComposingRegionCommand) {
            return iVar.toString();
        }
        if (iVar instanceof DeleteSurroundingTextCommand) {
            return iVar.toString();
        }
        if (iVar instanceof DeleteSurroundingTextInCodePointsCommand) {
            return iVar.toString();
        }
        if (iVar instanceof SetSelectionCommand) {
            return iVar.toString();
        }
        if (iVar instanceof n) {
            return iVar.toString();
        }
        if (iVar instanceof f) {
            return iVar.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown EditCommand: ");
        String strL = p013kotlin.jvm.internal.o0.b(iVar.getClass()).l();
        if (strL == null) {
            strL = "{anonymous EditCommand}";
        }
        sb4.append(strL);
        return sb4.toString();
    }

    public final TextFieldValue b(List<? extends i> editCommands) {
        i iVar = null;
        try {
            int size = editCommands.size();
            int i11 = 0;
            i iVar2 = null;
            while (i11 < size) {
                try {
                    i iVar3 = editCommands.get(i11);
                    try {
                        iVar3.a(this.mBuffer);
                        i11++;
                        iVar2 = iVar3;
                    } catch (Exception e11) {
                        e = e11;
                        iVar = iVar3;
                        throw new RuntimeException(c(editCommands, iVar), e);
                    }
                } catch (Exception e12) {
                    e = e12;
                    iVar = iVar2;
                }
            }
            i4.d dVarS = this.mBuffer.s();
            long jI = this.mBuffer.i();
            i4.p0 p0VarB = i4.p0.b(jI);
            p0VarB.getPackedValue();
            i4.p0 p0Var = i4.p0.m(this.mBufferState.getSelection()) ? null : p0VarB;
            TextFieldValue textFieldValue = new TextFieldValue(dVarS, p0Var != null ? p0Var.getPackedValue() : i4.q0.b(i4.p0.k(jI), i4.p0.l(jI)), this.mBuffer.d(), (DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e13) {
            e = e13;
        }
    }

    public final void d(TextFieldValue value, w0 textInputSession) {
        boolean zF = p013kotlin.jvm.internal.s.f(value.getComposition(), this.mBuffer.d());
        boolean z11 = true;
        boolean z12 = false;
        if (!p013kotlin.jvm.internal.s.f(this.mBufferState.getText(), value.getText())) {
            this.mBuffer = new l(value.getText(), value.getSelection(), null);
        } else if (i4.p0.g(this.mBufferState.getSelection(), value.getSelection())) {
            z11 = false;
        } else {
            this.mBuffer.p(i4.p0.l(value.getSelection()), i4.p0.k(value.getSelection()));
            z12 = true;
            z11 = false;
        }
        if (value.getComposition() == null) {
            this.mBuffer.a();
        } else if (!i4.p0.h(value.getComposition().getPackedValue())) {
            this.mBuffer.n(i4.p0.l(value.getComposition().getPackedValue()), i4.p0.k(value.getComposition().getPackedValue()));
        }
        if (z11 || (!z12 && !zF)) {
            this.mBuffer.a();
            value = TextFieldValue.c(value, null, 0L, null, 3, null);
        }
        TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = value;
        if (textInputSession != null) {
            textInputSession.d(textFieldValue, value);
        }
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextFieldValue getMBufferState() {
        return this.mBufferState;
    }
}
