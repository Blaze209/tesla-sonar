package com.fourthline.orca.core.flavor;

import android.graphics.Color;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006Y"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaColors;", "", "Lcom/fourthline/orca/core/flavor/OrcaPalette;", "palette", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaPalette;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaPalette;", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaPalette;)Lcom/fourthline/orca/core/flavor/OrcaColors;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaPalette;", "getPalette", "Lcom/fourthline/orca/core/flavor/OrcaBox;", "b", "Lcom/fourthline/orca/core/flavor/OrcaBox;", "getBox", "()Lcom/fourthline/orca/core/flavor/OrcaBox;", "setBox", "(Lcom/fourthline/orca/core/flavor/OrcaBox;)V", "box", "Lcom/fourthline/orca/core/flavor/OrcaButtons;", "c", "Lcom/fourthline/orca/core/flavor/OrcaButtons;", "getButtons", "()Lcom/fourthline/orca/core/flavor/OrcaButtons;", "setButtons", "(Lcom/fourthline/orca/core/flavor/OrcaButtons;)V", "buttons", "Lcom/fourthline/orca/core/flavor/OrcaScreen;", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/core/flavor/OrcaScreen;", "getScreen", "()Lcom/fourthline/orca/core/flavor/OrcaScreen;", "setScreen", "(Lcom/fourthline/orca/core/flavor/OrcaScreen;)V", AnalyticsContext.Screen, "Lcom/fourthline/orca/core/flavor/OrcaHint;", "e", "Lcom/fourthline/orca/core/flavor/OrcaHint;", "getHint", "()Lcom/fourthline/orca/core/flavor/OrcaHint;", "setHint", "(Lcom/fourthline/orca/core/flavor/OrcaHint;)V", "hint", "Lcom/fourthline/orca/core/flavor/OrcaInputField;", "f", "Lcom/fourthline/orca/core/flavor/OrcaInputField;", "getInputField", "()Lcom/fourthline/orca/core/flavor/OrcaInputField;", "setInputField", "(Lcom/fourthline/orca/core/flavor/OrcaInputField;)V", "inputField", "Lcom/fourthline/orca/core/flavor/OrcaPopup;", "g", "Lcom/fourthline/orca/core/flavor/OrcaPopup;", "getPopup", "()Lcom/fourthline/orca/core/flavor/OrcaPopup;", "setPopup", "(Lcom/fourthline/orca/core/flavor/OrcaPopup;)V", "popup", "Lcom/fourthline/orca/core/flavor/OrcaScanner;", "h", "Lcom/fourthline/orca/core/flavor/OrcaScanner;", "getScanner", "()Lcom/fourthline/orca/core/flavor/OrcaScanner;", "setScanner", "(Lcom/fourthline/orca/core/flavor/OrcaScanner;)V", AnalyticsContext.Scanner, "Lcom/fourthline/orca/core/flavor/OrcaGraphic;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/core/flavor/OrcaGraphic;", "getGraphic", "()Lcom/fourthline/orca/core/flavor/OrcaGraphic;", "setGraphic", "(Lcom/fourthline/orca/core/flavor/OrcaGraphic;)V", "graphic", "Companion", "OrcaColor", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrcaColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrcaPalette palette;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private OrcaBox box;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private OrcaButtons buttons;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private OrcaScreen screen;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private OrcaHint hint;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private OrcaInputField inputField;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private OrcaPopup popup;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private OrcaScanner scanner;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private OrcaGraphic graphic;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaColors$Companion;", "", "<init>", "()V", "defaultLightColors", "Lcom/fourthline/orca/core/flavor/OrcaColors;", "palette", "Lcom/fourthline/orca/core/flavor/OrcaPalette;", "defaultDarkColors", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OrcaColors defaultDarkColors$default(Companion companion, OrcaPalette orcaPalette, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                orcaPalette = new OrcaPalette(false, null, null, null, null, null, null, null, null, 510, null);
            }
            return companion.defaultDarkColors(orcaPalette);
        }

        public static /* synthetic */ OrcaColors defaultLightColors$default(Companion companion, OrcaPalette orcaPalette, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                orcaPalette = new OrcaPalette(true, null, null, null, null, null, null, null, null, 510, null);
            }
            return companion.defaultLightColors(orcaPalette);
        }

        public final OrcaColors defaultDarkColors(OrcaPalette palette) {
            s.k(palette, "palette");
            OrcaColors orcaColors = new OrcaColors(palette);
            orcaColors.getButtons().getSecondary().setBackgroundColor(new OrcaColor.FromInt(2503748));
            OrcaButtons.OrcaButton scannerSecondary = orcaColors.getButtons().getScannerSecondary();
            scannerSecondary.setTextColor(new OrcaColor.FromInt(16777215));
            scannerSecondary.setBackgroundColor(new OrcaColor.FromInt(4019825));
            scannerSecondary.setBorderColor(new OrcaColor.FromLong(0L));
            orcaColors.getScreen().setBackgroundColor(new OrcaColor.FromInt(1517111));
            orcaColors.getScreen().getTableCells().getCellStyle1().setBackgroundColor(new OrcaColor.FromInt(2503748));
            orcaColors.getInputField().setBackgroundColor(new OrcaColor.FromInt(2503748));
            orcaColors.getScanner().getConfirmation().setBackgroundColor(new OrcaColor.FromInt(1517111));
            orcaColors.getGraphic().setBackgroundColor(palette.getInternalPalette().b());
            return orcaColors;
        }

        public final OrcaColors defaultLightColors(OrcaPalette palette) {
            s.k(palette, "palette");
            return new OrcaColors(palette);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "", "FromInt", "FromLong", "FromRes", "FromColor", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromColor;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromInt;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromLong;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromRes;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OrcaColor {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromColor;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "Landroid/graphics/Color;", "color", "<init>", "(Landroid/graphics/Color;)V", "component1", "()Landroid/graphics/Color;", "copy", "(Landroid/graphics/Color;)Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromColor;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Color;", "getColor", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FromColor implements OrcaColor {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Color color;

            public FromColor(Color color) {
                s.k(color, "color");
                this.color = color;
            }

            public static /* synthetic */ FromColor copy$default(FromColor fromColor, Color color, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    color = fromColor.color;
                }
                return fromColor.copy(color);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Color getColor() {
                return this.color;
            }

            public final FromColor copy(Color color) {
                s.k(color, "color");
                return new FromColor(color);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FromColor) && s.f(this.color, ((FromColor) other).color);
            }

            public final Color getColor() {
                return this.color;
            }

            public int hashCode() {
                return this.color.hashCode();
            }

            public String toString() {
                return "FromColor(color=" + this.color + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromInt;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "", "color", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromInt;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getColor", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FromInt implements OrcaColor {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int color;

            public FromInt(int i11) {
                this.color = i11;
            }

            public static /* synthetic */ FromInt copy$default(FromInt fromInt, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = fromInt.color;
                }
                return fromInt.copy(i11);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getColor() {
                return this.color;
            }

            public final FromInt copy(int color) {
                return new FromInt(color);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FromInt) && this.color == ((FromInt) other).color;
            }

            public final int getColor() {
                return this.color;
            }

            public int hashCode() {
                return Integer.hashCode(this.color);
            }

            public String toString() {
                return "FromInt(color=" + this.color + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromLong;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "", "color", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromLong;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getColor", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FromLong implements OrcaColor {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final long color;

            public FromLong(long j11) {
                this.color = j11;
            }

            public static /* synthetic */ FromLong copy$default(FromLong fromLong, long j11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    j11 = fromLong.color;
                }
                return fromLong.copy(j11);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final long getColor() {
                return this.color;
            }

            public final FromLong copy(long color) {
                return new FromLong(color);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FromLong) && this.color == ((FromLong) other).color;
            }

            public final long getColor() {
                return this.color;
            }

            public int hashCode() {
                return Long.hashCode(this.color);
            }

            public String toString() {
                return "FromLong(color=" + this.color + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromRes;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "", "id", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromRes;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getId", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FromRes implements OrcaColor {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int id;

            public FromRes(int i11) {
                this.id = i11;
            }

            public static /* synthetic */ FromRes copy$default(FromRes fromRes, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = fromRes.id;
                }
                return fromRes.copy(i11);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            public final FromRes copy(int id2) {
                return new FromRes(id2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FromRes) && this.id == ((FromRes) other).id;
            }

            public final int getId() {
                return this.id;
            }

            public int hashCode() {
                return Integer.hashCode(this.id);
            }

            public String toString() {
                return "FromRes(id=" + this.id + ")";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrcaColors() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OrcaColors copy$default(OrcaColors orcaColors, OrcaPalette orcaPalette, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orcaPalette = orcaColors.palette;
        }
        return orcaColors.copy(orcaPalette);
    }

    public static final OrcaColors defaultDarkColors(OrcaPalette orcaPalette) {
        return INSTANCE.defaultDarkColors(orcaPalette);
    }

    public static final OrcaColors defaultLightColors(OrcaPalette orcaPalette) {
        return INSTANCE.defaultLightColors(orcaPalette);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaPalette getPalette() {
        return this.palette;
    }

    public final OrcaColors copy(OrcaPalette palette) {
        s.k(palette, "palette");
        return new OrcaColors(palette);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrcaColors) && s.f(this.palette, ((OrcaColors) other).palette);
    }

    public final OrcaBox getBox() {
        return this.box;
    }

    public final OrcaButtons getButtons() {
        return this.buttons;
    }

    public final OrcaGraphic getGraphic() {
        return this.graphic;
    }

    public final OrcaHint getHint() {
        return this.hint;
    }

    public final OrcaInputField getInputField() {
        return this.inputField;
    }

    public final OrcaPalette getPalette() {
        return this.palette;
    }

    public final OrcaPopup getPopup() {
        return this.popup;
    }

    public final OrcaScanner getScanner() {
        return this.scanner;
    }

    public final OrcaScreen getScreen() {
        return this.screen;
    }

    public int hashCode() {
        return this.palette.hashCode();
    }

    public final void setBox(OrcaBox orcaBox) {
        s.k(orcaBox, "<set-?>");
        this.box = orcaBox;
    }

    public final void setButtons(OrcaButtons orcaButtons) {
        s.k(orcaButtons, "<set-?>");
        this.buttons = orcaButtons;
    }

    public final void setGraphic(OrcaGraphic orcaGraphic) {
        s.k(orcaGraphic, "<set-?>");
        this.graphic = orcaGraphic;
    }

    public final void setHint(OrcaHint orcaHint) {
        s.k(orcaHint, "<set-?>");
        this.hint = orcaHint;
    }

    public final void setInputField(OrcaInputField orcaInputField) {
        s.k(orcaInputField, "<set-?>");
        this.inputField = orcaInputField;
    }

    public final void setPopup(OrcaPopup orcaPopup) {
        s.k(orcaPopup, "<set-?>");
        this.popup = orcaPopup;
    }

    public final void setScanner(OrcaScanner orcaScanner) {
        s.k(orcaScanner, "<set-?>");
        this.scanner = orcaScanner;
    }

    public final void setScreen(OrcaScreen orcaScreen) {
        s.k(orcaScreen, "<set-?>");
        this.screen = orcaScreen;
    }

    public String toString() {
        return "OrcaColors(palette=" + this.palette + ")";
    }

    public OrcaColors(OrcaPalette palette) {
        s.k(palette, "palette");
        this.palette = palette;
        this.box = new OrcaBox(palette.getInternalPalette().a(), palette.getInternalPalette().b(), palette.getDarkLight());
        this.buttons = new OrcaButtons(new OrcaButtons.OrcaButton(palette.getLight(), palette.getPrimary(), palette.getInternalPalette().b()), new OrcaButtons.OrcaButton(palette.getPrimary(), palette.getInternalPalette().g(), palette.getInternalPalette().b()), new OrcaButtons.OrcaButton(palette.getLight(), palette.getPrimary(), palette.getInternalPalette().b()), new OrcaButtons.OrcaButton(palette.getPrimary(), palette.getLight(), palette.getInternalPalette().b()), new OrcaButtons.OrcaCheckbox(palette.getPrimary(), palette.getLight()), palette.getPrimary(), palette.getPrimary());
        OrcaColor dark = palette.getDark();
        OrcaColor dark2 = palette.getDark();
        OrcaColor darkLight = palette.getDarkLight();
        this.screen = new OrcaScreen(palette.getLight(), dark, dark2, darkLight, palette.getInternalPalette().b(), new OrcaCells(new OrcaCell(palette.getLight(), palette.getDark(), palette.getPrimary(), palette.getGray(), palette.getInternalPalette().b()), new OrcaCell(palette.getLight(), palette.getPrimary(), palette.getPrimary(), palette.getInternalPalette().b(), palette.getInternalPalette().b())));
        this.hint = new OrcaHint(palette.getDark(), palette.getInternalPalette().j(), palette.getInternalPalette().g());
        this.inputField = new OrcaInputField(palette.getDark(), palette.getLight(), palette.getGray(), palette.getInternalPalette().f(), palette.getInternalPalette().d(), palette.getGray(), palette.getInternalPalette().c(), palette.getDarkLight(), palette.getDarkLighter(), palette.getInternalPalette().h());
        this.popup = new OrcaPopup(palette.getDark(), palette.getDarkLight(), palette.getLight());
        OrcaColor primary = palette.getPrimary();
        OrcaColor primary2 = palette.getPrimary();
        this.scanner = new OrcaScanner(new OrcaScannerConfirmation(palette.getInternalPalette().k(), palette.getDark(), palette.getInternalPalette().k()), palette.getInternalPalette().k(), primary2, primary);
        this.graphic = new OrcaGraphic(new OrcaColor.FromInt(15987699), palette.getPrimary());
    }

    public /* synthetic */ OrcaColors(OrcaPalette orcaPalette, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            orcaPalette = new OrcaPalette(false, null, null, null, null, null, null, null, null, 511, null);
        }
        this(orcaPalette);
    }
}
