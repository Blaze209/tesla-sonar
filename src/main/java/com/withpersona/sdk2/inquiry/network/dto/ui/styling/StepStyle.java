package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcelable;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u0004\u0018\u00010!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u0004\u0018\u00010%X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u0004\u0018\u00010)X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "Landroid/os/Parcelable;", "backgroundColorValue", "", "getBackgroundColorValue", "()Ljava/lang/Integer;", "fillColorValue", "getFillColorValue", "strokeColorValue", "getStrokeColorValue", "titleStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTitleStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "textStyleValue", "getTextStyleValue", "processingTitleStyleValue", "getProcessingTitleStyleValue", "processingTextStyleValue", "getProcessingTextStyleValue", "buttonPrimaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "getButtonPrimaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "buttonSecondaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "getButtonSecondaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "cancelDialogCloseStyleValue", "getCancelDialogCloseStyleValue", "cancelDialogResumeStyleValue", "getCancelDialogResumeStyleValue", "modalPaddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getModalPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "modalBorderRadiusValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getModalBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "backgroundImageName", "", "getBackgroundImageName", "()Ljava/lang/String;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface StepStyle extends Parcelable {
    Integer getBackgroundColorValue();

    String getBackgroundImageName();

    ButtonSubmitComponentStyle getButtonPrimaryStyleValue();

    ButtonCancelComponentStyle getButtonSecondaryStyleValue();

    ButtonSubmitComponentStyle getCancelDialogCloseStyleValue();

    ButtonCancelComponentStyle getCancelDialogResumeStyleValue();

    Integer getFillColorValue();

    StyleElements.Size getModalBorderRadiusValue();

    StyleElements.SizeSet getModalPaddingValue();

    TextBasedComponentStyle getProcessingTextStyleValue();

    TextBasedComponentStyle getProcessingTitleStyleValue();

    Integer getStrokeColorValue();

    TextBasedComponentStyle getTextStyleValue();

    TextBasedComponentStyle getTitleStyleValue();
}
