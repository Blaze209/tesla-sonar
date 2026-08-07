package oi0;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponent;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\r\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/EditText;", "editText", "Lkotlin/Function0;", "Ljn0/h0;", "moveToPreviousEditText", "l", "(Landroid/widget/EditText;Lwn0/a;)V", "n", "(Landroid/widget/EditText;)V", "", "originalString", "k", "(Landroid/widget/EditText;Ljava/lang/String;)V", "code", "", "editTexts", "j", "(Ljava/lang/String;Ljava/util/List;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a1 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements wn0.l<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f97543a = new a();

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof TextInputLayout);
        }
    }

    public static final ConstraintLayout f(InputConfirmationCodeComponent inputConfirmationCodeComponent, p5 uiComponentHelper, final InputConfirmationCode config) {
        final InputConfirmationCodeComponent inputConfirmationCodeComponent2;
        p013kotlin.jvm.internal.s.k(inputConfirmationCodeComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.c cVarC = ri0.c.c(uiComponentHelper.getLayoutInflater());
        String strC = inputConfirmationCodeComponent.getTextController().c();
        final List listP = p013kotlin.collections.v.p(cVarC.f108305b.getEditText(), cVarC.f108308e.getEditText(), cVarC.f108310g.getEditText(), cVarC.f108307d.getEditText());
        for (IndexedValue indexedValue : p013kotlin.collections.v.t1(listP)) {
            int index = indexedValue.getIndex();
            final EditText editText = (EditText) indexedValue.b();
            final EditText editText2 = (EditText) p013kotlin.collections.v.r0(listP, index - 1);
            final EditText editText3 = (EditText) p013kotlin.collections.v.r0(listP, index + 1);
            Character chP1 = p013kotlin.text.t.P1(strC, index);
            if (chP1 != null) {
                char cCharValue = chP1.charValue();
                if (editText != null) {
                    editText.setText(String.valueOf(cCharValue));
                }
            }
            if (editText != null) {
                inputConfirmationCodeComponent2 = inputConfirmationCodeComponent;
                yh0.a0.b(editText, new wn0.l() { // from class: oi0.v0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return a1.g(inputConfirmationCodeComponent2, cVarC, listP, editText, editText2, editText3, (String) obj);
                    }
                });
            } else {
                inputConfirmationCodeComponent2 = inputConfirmationCodeComponent;
            }
            if (editText2 != null) {
                l(editText, new wn0.a() { // from class: oi0.w0
                    @Override // wn0.a
                    public final Object invoke() {
                        return a1.h(editText2);
                    }
                });
            }
            n(editText);
            inputConfirmationCodeComponent = inputConfirmationCodeComponent2;
        }
        uiComponentHelper.d(new wn0.a() { // from class: oi0.x0
            @Override // wn0.a
            public final Object invoke() {
                return a1.i(cVarC, config);
            }
        });
        ConstraintLayout root = cVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g(InputConfirmationCodeComponent inputConfirmationCodeComponent, ri0.c cVar, List list, EditText editText, EditText editText2, EditText editText3, String newText) {
        Context context;
        p013kotlin.jvm.internal.s.k(newText, "newText");
        a30.t textController = inputConfirmationCodeComponent.getTextController();
        qi0.a aVar = qi0.a.f105586a;
        ConstraintLayout root = cVar.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        textController.a(aVar.a(root));
        if (newText.length() >= list.size()) {
            j(newText, list);
        } else if (newText.length() > 1) {
            k(editText, newText);
        } else if (p013kotlin.text.t.y0(newText) && editText2 != null) {
            editText2.requestFocus();
            editText2.setSelection(editText2.length());
        } else if (!p013kotlin.text.t.y0(newText) && editText3 != null) {
            editText3.requestFocus();
        } else if (!p013kotlin.text.t.y0(newText)) {
            inputConfirmationCodeComponent.getSubmitCodeHelper().b().invoke();
            EditText editText4 = cVar.f108307d.getEditText();
            if (editText4 != null && (context = editText4.getContext()) != null) {
                yh0.f.c(context);
            }
            EditText editText5 = cVar.f108307d.getEditText();
            if (editText5 != null) {
                editText5.clearFocus();
            }
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h(EditText editText) {
        editText.requestFocus();
        editText.setSelection(editText.length());
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i(ri0.c cVar, InputConfirmationCode inputConfirmationCode) {
        ConstraintLayout root = cVar.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ho0.i<TextInputLayout> iVarH = ho0.l.H(androidx.core.view.s0.a(root), a.f97543a);
        p013kotlin.jvm.internal.s.i(iVarH, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        for (TextInputLayout textInputLayout : iVarH) {
            InputTextBasedComponentStyle styles = inputConfirmationCode.getStyles();
            if (styles != null) {
                ui0.z.k(textInputLayout, styles);
            }
        }
        return jn0.h0.f84049a;
    }

    private static final void j(String str, List<? extends EditText> list) {
        if (str.length() >= list.size()) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                int length = (str.length() - list.size()) + i11;
                EditText editText = list.get(i11);
                if (editText != null) {
                    editText.setText(String.valueOf(str.charAt(length)));
                }
            }
        }
    }

    private static final void k(EditText editText, String str) {
        if (editText.getSelectionStart() == 1) {
            editText.setText(String.valueOf(p013kotlin.text.t.O1(str)));
        } else {
            editText.setText(String.valueOf(p013kotlin.text.t.Q1(str)));
        }
    }

    private static final void l(final EditText editText, final wn0.a<jn0.h0> aVar) {
        if (editText != null) {
            editText.setOnKeyListener(new View.OnKeyListener() { // from class: oi0.z0
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                    return a1.m(editText, aVar, view, i11, keyEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(EditText editText, wn0.a aVar, View view, int i11, KeyEvent keyEvent) {
        if (i11 != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        Editable text = editText.getText();
        p013kotlin.jvm.internal.s.j(text, "getText(...)");
        if (text.length() != 0) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    private static final void n(final EditText editText) {
        if (editText != null) {
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: oi0.y0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    a1.o(editText, view, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(EditText editText, View view, boolean z11) {
        if (z11) {
            Editable text = editText.getText();
            editText.setSelection(text != null ? text.length() : 0);
        }
    }
}
