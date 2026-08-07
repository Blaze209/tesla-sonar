package com.adyen.threeds2.customization;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.threeds2.util.Preconditions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import jn0.e;

/* JADX INFO: loaded from: classes3.dex */
public final class UiCustomization implements Parcelable {
    public static final Parcelable.Creator<UiCustomization> CREATOR = new Parcelable.Creator<UiCustomization>() { // from class: com.adyen.threeds2.customization.UiCustomization.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UiCustomization createFromParcel(Parcel parcel) {
            return new UiCustomization(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UiCustomization[] newArray(int i11) {
            return new UiCustomization[i11];
        }
    };
    private final HashMap<ButtonType, ButtonCustomization> mButtonTypeCustomizationMap;
    private final HashMap<Class<? extends Customization>, Customization> mCustomizationMap;

    /* JADX INFO: renamed from: com.adyen.threeds2.customization.UiCustomization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getSDKTransactionID;

        static {
            int[] iArr = new int[ButtonType.values().length];
            getSDKTransactionID = iArr;
            try {
                iArr[ButtonType.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getSDKTransactionID[ButtonType.RESEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum ButtonType {
        VERIFY,
        CONTINUE,
        NEXT,
        CANCEL,
        RESEND,
        OPEN_OOB_APP
    }

    public UiCustomization() {
        this.mButtonTypeCustomizationMap = new HashMap<>();
        this.mCustomizationMap = new HashMap<>();
    }

    private ButtonCustomization getOrCreateButtonCustomization(ButtonType buttonType) {
        ButtonCustomization buttonCustomization = this.mButtonTypeCustomizationMap.get(buttonType);
        if (buttonCustomization != null) {
            return buttonCustomization;
        }
        ButtonCustomization buttonCustomization2 = new ButtonCustomization();
        this.mButtonTypeCustomizationMap.put(buttonType, buttonCustomization2);
        return buttonCustomization2;
    }

    private <T extends Customization> T getOrCreateCustomization(Class<T> cls) {
        T t11 = (T) this.mCustomizationMap.get(cls);
        if (t11 != null) {
            return t11;
        }
        try {
            T tNewInstance = cls.newInstance();
            this.mCustomizationMap.put(cls, tNewInstance);
            return tNewInstance;
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Could not access constructor of " + cls.getSimpleName(), e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Could not instantiate " + cls.getSimpleName(), e12);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ButtonCustomization getButtonCustomization(ButtonType buttonType) {
        Preconditions.requireNonNull("buttonType", buttonType);
        return getOrCreateButtonCustomization(buttonType);
    }

    public final ExpandableInfoCustomization getExpandableInfoCustomization() {
        return (ExpandableInfoCustomization) getOrCreateCustomization(ExpandableInfoCustomization.class);
    }

    public final LabelCustomization getLabelCustomization() {
        return (LabelCustomization) getOrCreateCustomization(LabelCustomization.class);
    }

    public final ScreenCustomization getScreenCustomization() {
        return (ScreenCustomization) getOrCreateCustomization(ScreenCustomization.class);
    }

    public final SelectionItemCustomization getSelectionItemCustomization() {
        return (SelectionItemCustomization) getOrCreateCustomization(SelectionItemCustomization.class);
    }

    public final TextBoxCustomization getTextBoxCustomization() {
        return (TextBoxCustomization) getOrCreateCustomization(TextBoxCustomization.class);
    }

    public final ToolbarCustomization getToolbarCustomization() {
        return (ToolbarCustomization) getOrCreateCustomization(ToolbarCustomization.class);
    }

    public final void setBorderColor(String str) {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((TextBoxCustomization) getOrCreateCustomization(TextBoxCustomization.class)).setBorderColor(str);
        ((SelectionItemCustomization) getOrCreateCustomization(SelectionItemCustomization.class)).setBorderColor(str);
        ((ExpandableInfoCustomization) getOrCreateCustomization(ExpandableInfoCustomization.class)).setBorderColor(str);
    }

    public final void setButtonCustomization(ButtonCustomization buttonCustomization, ButtonType buttonType) {
        Preconditions.requireNonNull("buttonType", buttonType);
        this.mButtonTypeCustomizationMap.put(buttonType, buttonCustomization);
    }

    public final void setExpandableInfoCustomization(ExpandableInfoCustomization expandableInfoCustomization) {
        Preconditions.requireNonNull("expandableInfoCustomization", expandableInfoCustomization);
        this.mCustomizationMap.put(ExpandableInfoCustomization.class, expandableInfoCustomization);
    }

    public final void setHighlightedBackgroundColor(String str) {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((SelectionItemCustomization) getOrCreateCustomization(SelectionItemCustomization.class)).setHighlightedBackgroundColor(str);
        ((ExpandableInfoCustomization) getOrCreateCustomization(ExpandableInfoCustomization.class)).setHighlightedBackgroundColor(str);
        Iterator it = Arrays.asList(ButtonType.CANCEL, ButtonType.RESEND).iterator();
        while (it.hasNext()) {
            getOrCreateButtonCustomization((ButtonType) it.next()).setBackgroundColor(str);
        }
    }

    public final void setLabelCustomization(LabelCustomization labelCustomization) {
        Preconditions.requireNonNull("labelCustomization", labelCustomization);
        this.mCustomizationMap.put(LabelCustomization.class, labelCustomization);
    }

    public final void setScreenBackgroundColor(String str) {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((ScreenCustomization) getOrCreateCustomization(ScreenCustomization.class)).setBackgroundColor(str);
    }

    public final void setScreenCustomization(ScreenCustomization screenCustomization) {
        Preconditions.requireNonNull("screenCustomization", screenCustomization);
        this.mCustomizationMap.put(ScreenCustomization.class, screenCustomization);
    }

    public final void setSelectionItemCustomization(SelectionItemCustomization selectionItemCustomization) {
        Preconditions.requireNonNull("selectionItemCustomization", selectionItemCustomization);
        this.mCustomizationMap.put(SelectionItemCustomization.class, selectionItemCustomization);
    }

    @e
    public final void setStatusBarColor(String str) {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((ScreenCustomization) getOrCreateCustomization(ScreenCustomization.class)).setStatusBarColor(str);
    }

    public final void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) {
        Preconditions.requireNonNull("textBoxCustomization", textBoxCustomization);
        this.mCustomizationMap.put(TextBoxCustomization.class, textBoxCustomization);
    }

    public final void setTextColor(String str) {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((ScreenCustomization) getOrCreateCustomization(ScreenCustomization.class)).setTextColor(str);
        ((ToolbarCustomization) getOrCreateCustomization(ToolbarCustomization.class)).setTextColor(str);
        getOrCreateButtonCustomization(ButtonType.CANCEL).setTextColor(str);
        LabelCustomization labelCustomization = (LabelCustomization) getOrCreateCustomization(LabelCustomization.class);
        labelCustomization.setTextColor(str);
        labelCustomization.setHeadingTextColor(str);
        labelCustomization.setInputLabelTextColor(str);
        ((TextBoxCustomization) getOrCreateCustomization(TextBoxCustomization.class)).setTextColor(str);
        ((SelectionItemCustomization) getOrCreateCustomization(SelectionItemCustomization.class)).setTextColor(str);
        ExpandableInfoCustomization expandableInfoCustomization = (ExpandableInfoCustomization) getOrCreateCustomization(ExpandableInfoCustomization.class);
        expandableInfoCustomization.setTextColor(str);
        expandableInfoCustomization.setHeadingTextColor(str);
        expandableInfoCustomization.setExpandStateIndicatorColor(str);
    }

    public final void setTintColor(String str) {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((ToolbarCustomization) getOrCreateCustomization(ToolbarCustomization.class)).setBackgroundColor(str);
        ((SelectionItemCustomization) getOrCreateCustomization(SelectionItemCustomization.class)).setSelectionIndicatorTintColor(str);
        for (ButtonType buttonType : ButtonType.values()) {
            ButtonCustomization orCreateButtonCustomization = getOrCreateButtonCustomization(buttonType);
            int i11 = AnonymousClass1.getSDKTransactionID[buttonType.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    orCreateButtonCustomization.setBackgroundColor(str);
                } else {
                    orCreateButtonCustomization.setTextColor(str);
                }
            }
        }
    }

    public final void setToolbarCustomization(ToolbarCustomization toolbarCustomization) {
        Preconditions.requireNonNull("toolbarCustomization", toolbarCustomization);
        this.mCustomizationMap.put(ToolbarCustomization.class, toolbarCustomization);
    }

    public final void setToolbarTitle(String str) {
        Preconditions.requireNonEmpty("title", str);
        ((ToolbarCustomization) getOrCreateCustomization(ToolbarCustomization.class)).setHeaderText(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.mButtonTypeCustomizationMap);
        parcel.writeSerializable(this.mCustomizationMap);
    }

    UiCustomization(Parcel parcel) {
        this.mButtonTypeCustomizationMap = (HashMap) parcel.readSerializable();
        this.mCustomizationMap = (HashMap) parcel.readSerializable();
    }
}
