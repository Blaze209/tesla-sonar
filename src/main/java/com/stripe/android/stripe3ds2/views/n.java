package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001\u0013B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020#H\u0014¢\u0006\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b\n\u0010*R\u001a\u0010/\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b-\u0010.R\u001a\u00105\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010<\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R\u0014\u0010>\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00107R\u0014\u0010A\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001b\u0010E\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010B\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\bF\u0010DR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010D¨\u0006K"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/n;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "isSingleSelectMode", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "Lcom/stripe/android/stripe3ds2/transactions/b$a;", "option", "Lq80/b;", "buttonCustomization", "lastButton", "Landroid/widget/CompoundButton;", "a", "(Lcom/stripe/android/stripe3ds2/transactions/b$a;Lq80/b;Z)Landroid/widget/CompoundButton;", "", "options", "Ljn0/h0;", "setChallengeSelectOptions", "(Ljava/util/List;Lq80/b;)V", "", AnnotatedPrivateKey.LABEL, "Lq80/d;", "labelCustomization", "setTextEntryLabel", "(Ljava/lang/String;Lq80/d;)V", "index", "b", "(I)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Z", "()Z", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getInfoLabel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "infoLabel", "Landroid/widget/LinearLayout;", "c", "Landroid/widget/LinearLayout;", "getSelectGroup$3ds2sdk_release", "()Landroid/widget/LinearLayout;", "selectGroup", DateTokenConverter.CONVERTER_KEY, "I", "buttonBottomMargin", "e", "buttonLabelPadding", "f", "buttonOffsetMargin", "g", "buttonMinHeight", "getUserEntry", "()Ljava/lang/String;", "userEntry", "Landroid/widget/CheckBox;", "getCheckBoxes", "()Ljava/util/List;", "checkBoxes", "getSelectedOptions", "selectedOptions", "getSelectedIndexes$3ds2sdk_release", "selectedIndexes", "h", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f54308h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isSingleSelectMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ThreeDS2TextView infoLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LinearLayout selectGroup;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int buttonBottomMargin;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int buttonLabelPadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int buttonOffsetMargin;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int buttonMinHeight;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/n$a;", "", "<init>", "()V", "", "STATE_SELECTED_INDEXED", "Ljava/lang/String;", "STATE_SUPER", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/b$a;", "it", "", "a", "(Lcom/stripe/android/stripe3ds2/transactions/b$a;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<ChallengeResponseData.ChallengeSelectOption, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f54316c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(ChallengeResponseData.ChallengeSelectOption it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return it.getName();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        this(context, null, 0, false, 14, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public final CompoundButton a(ChallengeResponseData.ChallengeSelectOption option, q80.b buttonCustomization, boolean lastButton) {
        p013kotlin.jvm.internal.s.k(option, "option");
        CompoundButton materialRadioButton = this.isSingleSelectMode ? new MaterialRadioButton(getContext()) : new MaterialCheckBox(getContext());
        if (buttonCustomization != null) {
            String strE = buttonCustomization.e();
            if (strE != null && !p013kotlin.text.t.y0(strE)) {
                androidx.core.widget.c.d(materialRadioButton, ColorStateList.valueOf(Color.parseColor(buttonCustomization.e())));
            }
            String strF = buttonCustomization.f();
            if (strF != null && !p013kotlin.text.t.y0(strF)) {
                materialRadioButton.setTextColor(Color.parseColor(buttonCustomization.f()));
            }
        }
        materialRadioButton.setId(View.generateViewId());
        materialRadioButton.setTag(option);
        materialRadioButton.setText(option.getText());
        materialRadioButton.setPadding(this.buttonLabelPadding, materialRadioButton.getPaddingTop(), materialRadioButton.getPaddingRight(), materialRadioButton.getPaddingBottom());
        materialRadioButton.setMinimumHeight(this.buttonMinHeight);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        if (!lastButton) {
            layoutParams.bottomMargin = this.buttonBottomMargin;
        }
        layoutParams.leftMargin = this.buttonOffsetMargin;
        materialRadioButton.setLayoutParams(layoutParams);
        return materialRadioButton;
    }

    public final void b(int index) {
        View childAt = this.selectGroup.getChildAt(index);
        p013kotlin.jvm.internal.s.i(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
        ((CompoundButton) childAt).setChecked(true);
    }

    public final List<CheckBox> getCheckBoxes() {
        if (this.isSingleSelectMode) {
            return null;
        }
        bo0.j jVarW = bo0.n.w(0, this.selectGroup.getChildCount());
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(jVarW, 10));
        Iterator<Integer> it = jVarW.iterator();
        while (it.hasNext()) {
            View childAt = this.selectGroup.getChildAt(((s0) it).nextInt());
            p013kotlin.jvm.internal.s.i(childAt, "null cannot be cast to non-null type android.widget.CheckBox");
            arrayList.add((CheckBox) childAt);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: getInfoLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getInfoLabel() {
        return this.infoLabel;
    }

    /* JADX INFO: renamed from: getSelectGroup$3ds2sdk_release, reason: from getter */
    public final LinearLayout getSelectGroup() {
        return this.selectGroup;
    }

    public final List<Integer> getSelectedIndexes$3ds2sdk_release() {
        bo0.j jVarW = bo0.n.w(0, this.selectGroup.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = jVarW.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            View childAt = this.selectGroup.getChildAt(iNextInt);
            p013kotlin.jvm.internal.s.i(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
            Integer numValueOf = ((CompoundButton) childAt).isChecked() ? Integer.valueOf(iNextInt) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return p013kotlin.collections.v.d1(arrayList, this.isSingleSelectMode ? 1 : arrayList.size());
    }

    public final List<ChallengeResponseData.ChallengeSelectOption> getSelectedOptions() {
        List<Integer> selectedIndexes$3ds2sdk_release = getSelectedIndexes$3ds2sdk_release();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(selectedIndexes$3ds2sdk_release, 10));
        Iterator<T> it = selectedIndexes$3ds2sdk_release.iterator();
        while (it.hasNext()) {
            Object tag = this.selectGroup.getChildAt(((Number) it.next()).intValue()).getTag();
            p013kotlin.jvm.internal.s.i(tag, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.ChallengeSelectOption");
            arrayList.add((ChallengeResponseData.ChallengeSelectOption) tag);
        }
        return arrayList;
    }

    public String getUserEntry() {
        return p013kotlin.collections.v.y0(getSelectedOptions(), ",", null, null, 0, null, b.f54316c, 30, null);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        super.onRestoreInstanceState((Parcelable) q5.c.a(bundle, "state_super", Parcelable.class));
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("state_selected_indexes");
        if (integerArrayList != null) {
            for (Integer num : integerArrayList) {
                p013kotlin.jvm.internal.s.h(num);
                b(num.intValue());
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return q5.d.b(jn0.x.a("state_super", super.onSaveInstanceState()), jn0.x.a("state_selected_indexes", new ArrayList(getSelectedIndexes$3ds2sdk_release())));
    }

    public final void setChallengeSelectOptions(List<ChallengeResponseData.ChallengeSelectOption> options, q80.b buttonCustomization) {
        if (options != null) {
            int size = options.size();
            Iterator<Integer> it = bo0.n.w(0, size).iterator();
            while (it.hasNext()) {
                int iNextInt = ((s0) it).nextInt();
                ChallengeResponseData.ChallengeSelectOption challengeSelectOption = options.get(iNextInt);
                boolean z11 = true;
                if (iNextInt != size - 1) {
                    z11 = false;
                }
                this.selectGroup.addView(a(challengeSelectOption, buttonCustomization, z11));
            }
        }
    }

    public final void setTextEntryLabel(String label, q80.d labelCustomization) {
        if (label == null || p013kotlin.text.t.y0(label)) {
            this.infoLabel.setVisibility(8);
        } else {
            this.infoLabel.setText(label, labelCustomization);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, false, 8, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ n(Context context, AttributeSet attributeSet, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? false : z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.isSingleSelectMode = z11;
        if (getId() == -1) {
            setId(n80.d.f93655x);
        }
        this.buttonBottomMargin = context.getResources().getDimensionPixelSize(n80.b.f93623d);
        this.buttonLabelPadding = context.getResources().getDimensionPixelSize(n80.b.f93620a);
        this.buttonOffsetMargin = context.getResources().getDimensionPixelSize(n80.b.f93622c);
        this.buttonMinHeight = context.getResources().getDimensionPixelSize(n80.b.f93621b);
        if (z11) {
            o80.f fVarC = o80.f.c(LayoutInflater.from(context), this, true);
            p013kotlin.jvm.internal.s.j(fVarC, "inflate(...)");
            ThreeDS2TextView label = fVarC.f96858b;
            p013kotlin.jvm.internal.s.j(label, "label");
            this.infoLabel = label;
            RadioGroup selectGroup = fVarC.f96859c;
            p013kotlin.jvm.internal.s.j(selectGroup, "selectGroup");
            this.selectGroup = selectGroup;
            return;
        }
        o80.e eVarC = o80.e.c(LayoutInflater.from(context), this, true);
        p013kotlin.jvm.internal.s.j(eVarC, "inflate(...)");
        ThreeDS2TextView label2 = eVarC.f96855b;
        p013kotlin.jvm.internal.s.j(label2, "label");
        this.infoLabel = label2;
        LinearLayout selectGroup2 = eVarC.f96856c;
        p013kotlin.jvm.internal.s.j(selectGroup2, "selectGroup");
        this.selectGroup = selectGroup2;
    }
}
