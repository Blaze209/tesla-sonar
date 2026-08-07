package com.fourthline.scanners.config.orca.flavor.extensions;

import com.fourthline.orca.core.flavor.OrcaButtons;
import com.fourthline.orca.core.flavor.OrcaCell;
import com.fourthline.orca.core.flavor.OrcaCells;
import com.fourthline.orca.core.flavor.OrcaColors;
import com.fourthline.orca.core.flavor.OrcaGraphic;
import com.fourthline.orca.core.flavor.OrcaHint;
import com.fourthline.orca.core.flavor.OrcaInputField;
import com.fourthline.orca.core.flavor.OrcaPopup;
import com.fourthline.orca.core.flavor.OrcaScanner;
import com.fourthline.orca.core.flavor.OrcaScannerConfirmation;
import com.fourthline.orca.core.flavor.OrcaScreen;
import com.fourthline.scanners.config.orca.flavor.OrcaButtonsConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaCellConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaCellsConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaGraphicConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaHintConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaInputFieldConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaPopupConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaScannerConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaScannerConfirmationConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaScreenConfig;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\u0003\u001a\u00020\b\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000e\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0011\u001a\u0012\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014\u001a\u0012\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017\u001a\u0012\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001a\u001a\u0012\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001d\u001a\u0012\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\u0003\u001a\u00020 \u001a\u0012\u0010\"\u001a\u00020#*\u00020$2\u0006\u0010\u0003\u001a\u00020#¨\u0006%"}, d2 = {"mapToOrcaScreen", "Lcom/fourthline/orca/core/flavor/OrcaScreen;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaScreenConfig;", "target", "mapToOrcaCellsConfig", "Lcom/fourthline/orca/core/flavor/OrcaCells;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaCellsConfig;", "mapToCellConfig", "Lcom/fourthline/orca/core/flavor/OrcaCell;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaCellConfig;", "mapToOrcaInputField", "Lcom/fourthline/orca/core/flavor/OrcaInputField;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaInputFieldConfig;", "mapToOrcaButtons", "Lcom/fourthline/orca/core/flavor/OrcaButtons;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig;", "mapToOrcaCheckbox", "Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaCheckbox;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig$OrcaCheckboxConfig;", "mapToOrcaButton", "Lcom/fourthline/orca/core/flavor/OrcaButtons$OrcaButton;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig$OrcaButtonConfig;", "mapToOrcaScanner", "Lcom/fourthline/orca/core/flavor/OrcaScanner;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaScannerConfig;", "mapToOrcaScannerConfirmation", "Lcom/fourthline/orca/core/flavor/OrcaScannerConfirmation;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaScannerConfirmationConfig;", "mapToOrcaHint", "Lcom/fourthline/orca/core/flavor/OrcaHint;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaHintConfig;", "mapToOrcaPopup", "Lcom/fourthline/orca/core/flavor/OrcaPopup;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaPopupConfig;", "mapToOrcaGraphic", "Lcom/fourthline/orca/core/flavor/OrcaGraphic;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaGraphicConfig;", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OrcaElementsExtensionsKt {
    public static final OrcaCell mapToCellConfig(OrcaCellConfig orcaCellConfig, OrcaCell target) {
        OrcaColors.OrcaColor.FromLong orcaColor;
        OrcaColors.OrcaColor.FromLong orcaColor2;
        OrcaColors.OrcaColor.FromLong orcaColor3;
        OrcaColors.OrcaColor.FromLong orcaColor4;
        OrcaColors.OrcaColor.FromLong orcaColor5;
        s.k(orcaCellConfig, "<this>");
        s.k(target, "target");
        String backgroundColor = orcaCellConfig.getBackgroundColor();
        if (backgroundColor != null && (orcaColor5 = OrcaColorsConfigExtensionsKt.toOrcaColor(backgroundColor)) != null) {
            target.setBackgroundColor(orcaColor5);
        }
        String textColor = orcaCellConfig.getTextColor();
        if (textColor != null && (orcaColor4 = OrcaColorsConfigExtensionsKt.toOrcaColor(textColor)) != null) {
            target.setTextColor(orcaColor4);
        }
        String iconColor = orcaCellConfig.getIconColor();
        if (iconColor != null && (orcaColor3 = OrcaColorsConfigExtensionsKt.toOrcaColor(iconColor)) != null) {
            target.setIconColor(orcaColor3);
        }
        String borderColor = orcaCellConfig.getBorderColor();
        if (borderColor != null && (orcaColor2 = OrcaColorsConfigExtensionsKt.toOrcaColor(borderColor)) != null) {
            target.setBorderColor(orcaColor2);
        }
        String dividerColor = orcaCellConfig.getDividerColor();
        if (dividerColor != null && (orcaColor = OrcaColorsConfigExtensionsKt.toOrcaColor(dividerColor)) != null) {
            target.setDividerColor(orcaColor);
        }
        return target;
    }

    public static final OrcaButtons.OrcaButton mapToOrcaButton(OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig, OrcaButtons.OrcaButton target) {
        OrcaColors.OrcaColor.FromLong orcaColor;
        OrcaColors.OrcaColor.FromLong orcaColor2;
        OrcaColors.OrcaColor.FromLong orcaColor3;
        s.k(orcaButtonConfig, "<this>");
        s.k(target, "target");
        String textColor = orcaButtonConfig.getTextColor();
        if (textColor != null && (orcaColor3 = OrcaColorsConfigExtensionsKt.toOrcaColor(textColor)) != null) {
            target.setTextColor(orcaColor3);
        }
        String backgroundColor = orcaButtonConfig.getBackgroundColor();
        if (backgroundColor != null && (orcaColor2 = OrcaColorsConfigExtensionsKt.toOrcaColor(backgroundColor)) != null) {
            target.setBackgroundColor(orcaColor2);
        }
        String borderColor = orcaButtonConfig.getBorderColor();
        if (borderColor != null && (orcaColor = OrcaColorsConfigExtensionsKt.toOrcaColor(borderColor)) != null) {
            target.setBorderColor(orcaColor);
        }
        return target;
    }

    public static final OrcaButtons mapToOrcaButtons(OrcaButtonsConfig orcaButtonsConfig, OrcaButtons target) {
        OrcaColors.OrcaColor.FromLong orcaColor;
        OrcaColors.OrcaColor.FromLong orcaColor2;
        OrcaButtons.OrcaCheckbox orcaCheckboxMapToOrcaCheckbox;
        OrcaButtons.OrcaButton orcaButtonMapToOrcaButton;
        OrcaButtons.OrcaButton orcaButtonMapToOrcaButton2;
        OrcaButtons.OrcaButton orcaButtonMapToOrcaButton3;
        OrcaButtons.OrcaButton orcaButtonMapToOrcaButton4;
        s.k(orcaButtonsConfig, "<this>");
        s.k(target, "target");
        OrcaButtonsConfig.OrcaButtonConfig primary = orcaButtonsConfig.getPrimary();
        if (primary != null && (orcaButtonMapToOrcaButton4 = mapToOrcaButton(primary, target.getPrimary())) != null) {
            target.setPrimary(orcaButtonMapToOrcaButton4);
        }
        OrcaButtonsConfig.OrcaButtonConfig secondary = orcaButtonsConfig.getSecondary();
        if (secondary != null && (orcaButtonMapToOrcaButton3 = mapToOrcaButton(secondary, target.getSecondary())) != null) {
            target.setSecondary(orcaButtonMapToOrcaButton3);
        }
        OrcaButtonsConfig.OrcaButtonConfig scannerPrimary = orcaButtonsConfig.getScannerPrimary();
        if (scannerPrimary != null && (orcaButtonMapToOrcaButton2 = mapToOrcaButton(scannerPrimary, target.getScannerPrimary())) != null) {
            target.setScannerPrimary(orcaButtonMapToOrcaButton2);
        }
        OrcaButtonsConfig.OrcaButtonConfig scannerSecondary = orcaButtonsConfig.getScannerSecondary();
        if (scannerSecondary != null && (orcaButtonMapToOrcaButton = mapToOrcaButton(scannerSecondary, target.getScannerSecondary())) != null) {
            target.setScannerSecondary(orcaButtonMapToOrcaButton);
        }
        OrcaButtonsConfig.OrcaCheckboxConfig checkbox = orcaButtonsConfig.getCheckbox();
        if (checkbox != null && (orcaCheckboxMapToOrcaCheckbox = mapToOrcaCheckbox(checkbox, target.getCheckbox())) != null) {
            target.setCheckbox(orcaCheckboxMapToOrcaCheckbox);
        }
        String linkButtonColor = orcaButtonsConfig.getLinkButtonColor();
        if (linkButtonColor != null && (orcaColor2 = OrcaColorsConfigExtensionsKt.toOrcaColor(linkButtonColor)) != null) {
            target.setLinkButtonColor(orcaColor2);
        }
        String backButtonColor = orcaButtonsConfig.getBackButtonColor();
        if (backButtonColor != null && (orcaColor = OrcaColorsConfigExtensionsKt.toOrcaColor(backButtonColor)) != null) {
            target.setBackButtonColor(orcaColor);
        }
        return target;
    }

    public static final OrcaCells mapToOrcaCellsConfig(OrcaCellsConfig orcaCellsConfig, OrcaCells target) {
        OrcaCell orcaCellMapToCellConfig;
        OrcaCell orcaCellMapToCellConfig2;
        s.k(orcaCellsConfig, "<this>");
        s.k(target, "target");
        OrcaCellConfig cellStyle1 = orcaCellsConfig.getCellStyle1();
        if (cellStyle1 != null && (orcaCellMapToCellConfig2 = mapToCellConfig(cellStyle1, target.getCellStyle1())) != null) {
            target.setCellStyle1(orcaCellMapToCellConfig2);
        }
        OrcaCellConfig cellStyle2 = orcaCellsConfig.getCellStyle2();
        if (cellStyle2 != null && (orcaCellMapToCellConfig = mapToCellConfig(cellStyle2, target.getCellStyle2())) != null) {
            target.setCellStyle2(orcaCellMapToCellConfig);
        }
        return target;
    }

    public static final OrcaButtons.OrcaCheckbox mapToOrcaCheckbox(OrcaButtonsConfig.OrcaCheckboxConfig orcaCheckboxConfig, OrcaButtons.OrcaCheckbox target) {
        OrcaColors.OrcaColor.FromLong orcaColor;
        OrcaColors.OrcaColor.FromLong orcaColor2;
        s.k(orcaCheckboxConfig, "<this>");
        s.k(target, "target");
        String tintColor = orcaCheckboxConfig.getTintColor();
        if (tintColor != null && (orcaColor2 = OrcaColorsConfigExtensionsKt.toOrcaColor(tintColor)) != null) {
            target.setTintColor(orcaColor2);
        }
        String iconColor = orcaCheckboxConfig.getIconColor();
        if (iconColor != null && (orcaColor = OrcaColorsConfigExtensionsKt.toOrcaColor(iconColor)) != null) {
            target.setIconColor(orcaColor);
        }
        return target;
    }

    public static final OrcaGraphic mapToOrcaGraphic(OrcaGraphicConfig orcaGraphicConfig, OrcaGraphic target) {
        OrcaColors.OrcaColor.FromLong orcaColor;
        OrcaColors.OrcaColor.FromLong orcaColor2;
        s.k(orcaGraphicConfig, "<this>");
        s.k(target, "target");
        String backgroundColor = orcaGraphicConfig.getBackgroundColor();
        if (backgroundColor != null && (orcaColor2 = OrcaColorsConfigExtensionsKt.toOrcaColor(backgroundColor)) != null) {
            target.setBackgroundColor(orcaColor2);
        }
        String primaryColor = orcaGraphicConfig.getPrimaryColor();
        if (primaryColor != null && (orcaColor = OrcaColorsConfigExtensionsKt.toOrcaColor(primaryColor)) != null) {
            target.setPrimaryColor(orcaColor);
        }
        return target;
    }

    public static final OrcaHint mapToOrcaHint(OrcaHintConfig orcaHintConfig, OrcaHint target) {
        OrcaColors.OrcaColor.FromLong orcaColor;
        OrcaColors.OrcaColor.FromLong orcaColor2;
        OrcaColors.OrcaColor.FromLong orcaColor3;
        s.k(orcaHintConfig, "<this>");
        s.k(target, "target");
        String textColor = orcaHintConfig.getTextColor();
        if (textColor != null && (orcaColor3 = OrcaColorsConfigExtensionsKt.toOrcaColor(textColor)) != null) {
            target.setTextColor(orcaColor3);
        }
        String backgroundColor = orcaHintConfig.getBackgroundColor();
        if (backgroundColor != null && (orcaColor2 = OrcaColorsConfigExtensionsKt.toOrcaColor(backgroundColor)) != null) {
            target.setBackgroundColor(orcaColor2);
        }
        String borderColor = orcaHintConfig.getBorderColor();
        if (borderColor != null && (orcaColor = OrcaColorsConfigExtensionsKt.toOrcaColor(borderColor)) != null) {
            target.setBorderColor(orcaColor);
        }
        return target;
    }

    public static final OrcaInputField mapToOrcaInputField(OrcaInputFieldConfig orcaInputFieldConfig, OrcaInputField target) {
        OrcaColors.OrcaColor.FromLong orcaColor;
        OrcaColors.OrcaColor.FromLong orcaColor2;
        OrcaColors.OrcaColor.FromLong orcaColor3;
        OrcaColors.OrcaColor.FromLong orcaColor4;
        OrcaColors.OrcaColor.FromLong orcaColor5;
        OrcaColors.OrcaColor.FromLong orcaColor6;
        OrcaColors.OrcaColor.FromLong orcaColor7;
        OrcaColors.OrcaColor.FromLong orcaColor8;
        OrcaColors.OrcaColor.FromLong orcaColor9;
        OrcaColors.OrcaColor.FromLong orcaColor10;
        s.k(orcaInputFieldConfig, "<this>");
        s.k(target, "target");
        String textColor = orcaInputFieldConfig.getTextColor();
        if (textColor != null && (orcaColor10 = OrcaColorsConfigExtensionsKt.toOrcaColor(textColor)) != null) {
            target.setTextColor(orcaColor10);
        }
        String backgroundColor = orcaInputFieldConfig.getBackgroundColor();
        if (backgroundColor != null && (orcaColor9 = OrcaColorsConfigExtensionsKt.toOrcaColor(backgroundColor)) != null) {
            target.setBackgroundColor(orcaColor9);
        }
        String borderColor = orcaInputFieldConfig.getBorderColor();
        if (borderColor != null && (orcaColor8 = OrcaColorsConfigExtensionsKt.toOrcaColor(borderColor)) != null) {
            target.setBorderColor(orcaColor8);
        }
        String disabledTextColor = orcaInputFieldConfig.getDisabledTextColor();
        if (disabledTextColor != null && (orcaColor7 = OrcaColorsConfigExtensionsKt.toOrcaColor(disabledTextColor)) != null) {
            target.setDisabledTextColor(orcaColor7);
        }
        String disabledBackgroundColor = orcaInputFieldConfig.getDisabledBackgroundColor();
        if (disabledBackgroundColor != null && (orcaColor6 = OrcaColorsConfigExtensionsKt.toOrcaColor(disabledBackgroundColor)) != null) {
            target.setDisabledBackgroundColor(orcaColor6);
        }
        String disabledBorderColor = orcaInputFieldConfig.getDisabledBorderColor();
        if (disabledBorderColor != null && (orcaColor5 = OrcaColorsConfigExtensionsKt.toOrcaColor(disabledBorderColor)) != null) {
            target.setDisabledBorderColor(orcaColor5);
        }
        String placeholderColor = orcaInputFieldConfig.getPlaceholderColor();
        if (placeholderColor != null && (orcaColor4 = OrcaColorsConfigExtensionsKt.toOrcaColor(placeholderColor)) != null) {
            target.setPlaceholderColor(orcaColor4);
        }
        String titleColor = orcaInputFieldConfig.getTitleColor();
        if (titleColor != null && (orcaColor3 = OrcaColorsConfigExtensionsKt.toOrcaColor(titleColor)) != null) {
            target.setTitleColor(orcaColor3);
        }
        String statusColor = orcaInputFieldConfig.getStatusColor();
        if (statusColor != null && (orcaColor2 = OrcaColorsConfigExtensionsKt.toOrcaColor(statusColor)) != null) {
            target.setStatusColor(orcaColor2);
        }
        String errorColor = orcaInputFieldConfig.getErrorColor();
        if (errorColor != null && (orcaColor = OrcaColorsConfigExtensionsKt.toOrcaColor(errorColor)) != null) {
            target.setErrorColor(orcaColor);
        }
        return target;
    }

    public static final OrcaPopup mapToOrcaPopup(OrcaPopupConfig orcaPopupConfig, OrcaPopup target) {
        OrcaColors.OrcaColor.FromLong orcaColor;
        OrcaColors.OrcaColor.FromLong orcaColor2;
        OrcaColors.OrcaColor.FromLong orcaColor3;
        s.k(orcaPopupConfig, "<this>");
        s.k(target, "target");
        String titleColor = orcaPopupConfig.getTitleColor();
        if (titleColor != null && (orcaColor3 = OrcaColorsConfigExtensionsKt.toOrcaColor(titleColor)) != null) {
            target.setTitleColor(orcaColor3);
        }
        String messageColor = orcaPopupConfig.getMessageColor();
        if (messageColor != null && (orcaColor2 = OrcaColorsConfigExtensionsKt.toOrcaColor(messageColor)) != null) {
            target.setMessageColor(orcaColor2);
        }
        String backgroundColor = orcaPopupConfig.getBackgroundColor();
        if (backgroundColor != null && (orcaColor = OrcaColorsConfigExtensionsKt.toOrcaColor(backgroundColor)) != null) {
            target.setBackgroundColor(orcaColor);
        }
        return target;
    }

    public static final OrcaScanner mapToOrcaScanner(OrcaScannerConfig orcaScannerConfig, OrcaScanner target) {
        OrcaScannerConfirmation orcaScannerConfirmationMapToOrcaScannerConfirmation;
        OrcaColors.OrcaColor.FromLong orcaColor;
        OrcaColors.OrcaColor.FromLong orcaColor2;
        s.k(orcaScannerConfig, "<this>");
        s.k(target, "target");
        String spinnerColor = orcaScannerConfig.getSpinnerColor();
        if (spinnerColor != null && (orcaColor2 = OrcaColorsConfigExtensionsKt.toOrcaColor(spinnerColor)) != null) {
            target.setSpinnerColor(orcaColor2);
        }
        String progressColor = orcaScannerConfig.getProgressColor();
        if (progressColor != null && (orcaColor = OrcaColorsConfigExtensionsKt.toOrcaColor(progressColor)) != null) {
            target.setProgressColor(orcaColor);
        }
        OrcaScannerConfirmationConfig confirmation = orcaScannerConfig.getConfirmation();
        if (confirmation != null && (orcaScannerConfirmationMapToOrcaScannerConfirmation = mapToOrcaScannerConfirmation(confirmation, target.getConfirmation())) != null) {
            target.setConfirmation(orcaScannerConfirmationMapToOrcaScannerConfirmation);
        }
        return target;
    }

    public static final OrcaScannerConfirmation mapToOrcaScannerConfirmation(OrcaScannerConfirmationConfig orcaScannerConfirmationConfig, OrcaScannerConfirmation target) {
        OrcaColors.OrcaColor.FromLong orcaColor;
        OrcaColors.OrcaColor.FromLong orcaColor2;
        OrcaColors.OrcaColor.FromLong orcaColor3;
        s.k(orcaScannerConfirmationConfig, "<this>");
        s.k(target, "target");
        String textColor = orcaScannerConfirmationConfig.getTextColor();
        if (textColor != null && (orcaColor3 = OrcaColorsConfigExtensionsKt.toOrcaColor(textColor)) != null) {
            target.setTextColor(orcaColor3);
        }
        String backgroundColor = orcaScannerConfirmationConfig.getBackgroundColor();
        if (backgroundColor != null && (orcaColor2 = OrcaColorsConfigExtensionsKt.toOrcaColor(backgroundColor)) != null) {
            target.setBackgroundColor(orcaColor2);
        }
        String bulletListColor = orcaScannerConfirmationConfig.getBulletListColor();
        if (bulletListColor != null && (orcaColor = OrcaColorsConfigExtensionsKt.toOrcaColor(bulletListColor)) != null) {
            target.setBulletListColor(orcaColor);
        }
        return target;
    }

    public static final OrcaScreen mapToOrcaScreen(OrcaScreenConfig orcaScreenConfig, OrcaScreen target) {
        OrcaCells orcaCellsMapToOrcaCellsConfig;
        OrcaColors.OrcaColor.FromLong orcaColor;
        OrcaColors.OrcaColor.FromLong orcaColor2;
        OrcaColors.OrcaColor.FromLong orcaColor3;
        OrcaColors.OrcaColor.FromLong orcaColor4;
        OrcaColors.OrcaColor.FromLong orcaColor5;
        s.k(orcaScreenConfig, "<this>");
        s.k(target, "target");
        String backgroundColor = orcaScreenConfig.getBackgroundColor();
        if (backgroundColor != null && (orcaColor5 = OrcaColorsConfigExtensionsKt.toOrcaColor(backgroundColor)) != null) {
            target.setBackgroundColor(orcaColor5);
        }
        String headerColor = orcaScreenConfig.getHeaderColor();
        if (headerColor != null && (orcaColor4 = OrcaColorsConfigExtensionsKt.toOrcaColor(headerColor)) != null) {
            target.setHeaderColor(orcaColor4);
        }
        String titleColor = orcaScreenConfig.getTitleColor();
        if (titleColor != null && (orcaColor3 = OrcaColorsConfigExtensionsKt.toOrcaColor(titleColor)) != null) {
            target.setTitleColor(orcaColor3);
        }
        String messageColor = orcaScreenConfig.getMessageColor();
        if (messageColor != null && (orcaColor2 = OrcaColorsConfigExtensionsKt.toOrcaColor(messageColor)) != null) {
            target.setMessageColor(orcaColor2);
        }
        String dividerColor = orcaScreenConfig.getDividerColor();
        if (dividerColor != null && (orcaColor = OrcaColorsConfigExtensionsKt.toOrcaColor(dividerColor)) != null) {
            target.setDividerColor(orcaColor);
        }
        OrcaCellsConfig tableCells = orcaScreenConfig.getTableCells();
        if (tableCells != null && (orcaCellsMapToOrcaCellsConfig = mapToOrcaCellsConfig(tableCells, target.getTableCells())) != null) {
            target.setTableCells(orcaCellsMapToOrcaCellsConfig);
        }
        return target;
    }
}
