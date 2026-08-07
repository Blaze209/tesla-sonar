package ch0;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.z0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.withpersona.sdk2.inquiry.internal.j;
import com.withpersona.sdk2.inquiry.internal.m;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ui0.e0;
import yh0.f0;
import zs.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lch0/e;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Ldh0/a;", "binding", "", "isWrappingButtons", "Ljn0/h0;", "q", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ldh0/a;Z)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "n", "Ldh0/a;", "s", "()Ldh0/a;", "y", "(Ldh0/a;)V", "Lcom/withpersona/sdk2/inquiry/internal/m$b$a;", "r", "()Lcom/withpersona/sdk2/inquiry/internal/m$b$a;", "args", "Lcom/withpersona/sdk2/inquiry/internal/j;", "t", "()Lcom/withpersona/sdk2/inquiry/internal/j;", "inquiryFragment", "o", "a", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends com.google.android.material.bottomsheet.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public dh0.a binding;

    /* JADX INFO: renamed from: ch0.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lch0/e$a;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "theme", "Lcom/withpersona/sdk2/inquiry/internal/m$b$a;", "cancelOutput", "Ljn0/h0;", "a", "(Landroidx/fragment/app/FragmentManager;ILcom/withpersona/sdk2/inquiry/internal/m$b$a;)V", "", "ARGUMENT_CANCEL_OUTPUT", "Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager, int theme, m.b.Cancel cancelOutput) {
            s.k(fragmentManager, "fragmentManager");
            s.k(cancelOutput, "cancelOutput");
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGUMENT_CANCEL_OUTPUT", cancelOutput);
            eVar.setArguments(bundle);
            if (cancelOutput.getStyles() == null) {
                eVar.setStyle(0, theme);
            }
            eVar.show(fragmentManager, "cancel_dialog_fragment");
        }

        private Companion() {
        }
    }

    private final void q(StepStyle styles, dh0.a binding, boolean isWrappingButtons) {
        ButtonCancelComponentStyle cancelDialogResumeStyleValue;
        ButtonSubmitComponentStyle cancelDialogCloseStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView hintTitle = binding.f60621f;
            s.j(hintTitle, "hintTitle");
            e0.n(hintTitle, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView hintMessage = binding.f60620e;
            s.j(hintMessage, "hintMessage");
            e0.n(hintMessage, textStyleValue, null, 2, null);
        }
        if (styles != null && (cancelDialogCloseStyleValue = styles.getCancelDialogCloseStyleValue()) != null) {
            Button closeButton = binding.f60618c;
            s.j(closeButton, "closeButton");
            ui0.e.f(closeButton, cancelDialogCloseStyleValue, false, !isWrappingButtons, 2, null);
        }
        if (styles == null || (cancelDialogResumeStyleValue = styles.getCancelDialogResumeStyleValue()) == null) {
            return;
        }
        Button retryButton = binding.f60622g;
        s.j(retryButton, "retryButton");
        ui0.e.f(retryButton, cancelDialogResumeStyleValue, false, !isWrappingButtons, 2, null);
    }

    private final m.b.Cancel r() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (m.b.Cancel) q5.c.a(arguments, "ARGUMENT_CANCEL_OUTPUT", m.b.Cancel.class);
        }
        return null;
    }

    private final j t() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof j) {
            return (j) parentFragment;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Dialog dialog, e eVar, DialogInterface dialogInterface) {
        ViewGroup viewGroup = (ViewGroup) dialog.findViewById(g.f128694f);
        viewGroup.setBackgroundResource(R.color.transparent);
        s.h(viewGroup);
        m.b.Cancel cancelR = eVar.r();
        StepStyle styles = cancelR != null ? cancelR.getStyles() : null;
        ConstraintLayout bottomSheetContent = eVar.s().f60617b;
        s.j(bottomSheetContent, "bottomSheetContent");
        ui0.c.c(viewGroup, styles, bottomSheetContent, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 v(dh0.a aVar, e eVar, m.b.Cancel cancel) {
        boolean z11 = true;
        if (aVar.f60618c.getLineCount() > 1 || aVar.f60622g.getLineCount() > 1) {
            Button closeButton = aVar.f60618c;
            s.j(closeButton, "closeButton");
            ViewGroup.LayoutParams layoutParams = closeButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = aVar.f60619d.getWidth();
            closeButton.setLayoutParams(layoutParams);
            Button retryButton = aVar.f60622g;
            s.j(retryButton, "retryButton");
            ViewGroup.LayoutParams layoutParams2 = retryButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = aVar.f60619d.getWidth();
            retryButton.setLayoutParams(layoutParams2);
            aVar.f60619d.setReferencedIds(new int[]{aVar.f60618c.getId(), aVar.f60622g.getId()});
        } else {
            z11 = false;
        }
        eVar.q(cancel.getStyles(), aVar, z11);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(e eVar, View view) {
        eVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(e eVar, m.b.Cancel cancel, View view) {
        eVar.dismiss();
        j jVarT = eVar.t();
        if (jVarT != null) {
            jVarT.n(cancel);
        }
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.i, androidx.fragment.app.o
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        s.j(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ch0.d
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                e.u(dialogOnCreateDialog, this, dialogInterface);
            }
        });
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.k(inflater, "inflater");
        super.onCreateView(inflater, container, savedInstanceState);
        y(dh0.a.c(inflater, container, false));
        ConstraintLayout root = s().getRoot();
        s.j(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Window window;
        int iD;
        Integer backgroundColorValue;
        s.k(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final m.b.Cancel cancelR = r();
        if (cancelR == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
            z0.b(window, false);
            StepStyle styles = cancelR.getStyles();
            if (styles == null || (backgroundColorValue = styles.getBackgroundColorValue()) == null) {
                Context context = window.getContext();
                s.j(context, "getContext(...)");
                iD = yh0.s.d(context, zs.c.f128599w, null, false, 6, null);
            } else {
                iD = backgroundColorValue.intValue();
            }
            f0.a(window, iD);
        }
        final dh0.a aVarS = s();
        String title = cancelR.getTitle();
        if (title != null) {
            aVarS.f60621f.setText(title);
        }
        String message = cancelR.getMessage();
        if (message != null) {
            aVarS.f60620e.setText(message);
        }
        String cancelButtonText = cancelR.getCancelButtonText();
        if (cancelButtonText != null) {
            aVarS.f60618c.setText(cancelButtonText);
        }
        String resumeButtonText = cancelR.getResumeButtonText();
        if (resumeButtonText != null) {
            aVarS.f60622g.setText(resumeButtonText);
        }
        aVarS.f60622g.setOnClickListener(new View.OnClickListener() { // from class: ch0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.w(this.f19348a, view2);
            }
        });
        aVarS.f60618c.setOnClickListener(new View.OnClickListener() { // from class: ch0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.x(this.f19349a, cancelR, view2);
            }
        });
        Button closeButton = aVarS.f60618c;
        s.j(closeButton, "closeButton");
        ki0.s.b(closeButton, new wn0.a() { // from class: ch0.c
            @Override // wn0.a
            public final Object invoke() {
                return e.v(aVarS, this, cancelR);
            }
        });
    }

    public final dh0.a s() {
        dh0.a aVar = this.binding;
        if (aVar != null) {
            return aVar;
        }
        s.B("binding");
        return null;
    }

    public final void y(dh0.a aVar) {
        s.k(aVar, "<set-?>");
        this.binding = aVar;
    }
}
