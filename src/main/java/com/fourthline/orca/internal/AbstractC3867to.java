package com.fourthline.orca.internal;

import android.os.Build;
import com.fourthline.orca.core.flavor.OrcaBox;
import com.fourthline.orca.core.flavor.OrcaButtons;
import com.fourthline.orca.core.flavor.OrcaCell;
import com.fourthline.orca.core.flavor.OrcaColors;
import com.fourthline.orca.core.flavor.OrcaGraphic;
import com.fourthline.orca.core.flavor.OrcaHint;
import com.fourthline.orca.core.flavor.OrcaInputField;
import com.fourthline.orca.core.flavor.OrcaPopup;
import com.fourthline.orca.core.flavor.OrcaScanner;
import com.fourthline.orca.core.flavor.OrcaScannerConfirmation;
import com.fourthline.orca.core.flavor.OrcaScreen;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.to, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3867to {
    public static final C3824so a(OrcaColors orcaColors, boolean z11, p020r2.l lVar, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(orcaColors, "<this>");
        lVar.o(-2055715989);
        boolean z12 = (i12 & 1) != 0 ? true : z11;
        if (p020r2.o.J()) {
            p020r2.o.S(-2055715989, i11, -1, "com.fourthline.orca.core.internal.styling.color.toComposeColors (OrcaColors.kt:40)");
        }
        long jA = a(orcaColors.getPalette().getPrimary(), lVar, 0);
        long jA2 = a(orcaColors.getPalette().getAccent(), lVar, 0);
        lVar.o(-1207554361);
        OrcaButtons buttons = orcaColors.getButtons();
        C3653oo.a aVarA = a(buttons.getPrimary(), lVar, 0);
        C3653oo.a aVarA2 = a(buttons.getSecondary(), lVar, 0);
        C3653oo.a aVarA3 = a(buttons.getScannerPrimary(), lVar, 0);
        C3653oo.a aVarA4 = a(buttons.getScannerSecondary(), lVar, 0);
        long jA3 = a(buttons.getLinkButtonColor(), lVar, 0);
        long jA4 = a(buttons.getBackButtonColor(), lVar, 0);
        lVar.o(-1207540250);
        OrcaButtons.OrcaCheckbox checkbox = buttons.getCheckbox();
        C3653oo.b bVar = new C3653oo.b(a(checkbox.getTintColor(), lVar, 0), a(checkbox.getIconColor(), lVar, 0), null);
        lVar.l();
        C3653oo c3653oo = new C3653oo(aVarA, aVarA2, aVarA3, aVarA4, bVar, jA3, jA4, null);
        lVar.l();
        lVar.o(-1207530233);
        OrcaScreen screen = orcaColors.getScreen();
        long jA5 = a(screen.getBackgroundColor(), lVar, 0);
        long jA6 = a(screen.getHeaderColor(), lVar, 0);
        long jA7 = a(screen.getTitleColor(), lVar, 0);
        long jA8 = a(screen.getMessageColor(), lVar, 0);
        lVar.o(-1207519687);
        OrcaCell cellStyle1 = screen.getTableCells().getCellStyle1();
        C3696po c3696po = new C3696po(a(cellStyle1.getBackgroundColor(), lVar, 0), a(cellStyle1.getTextColor(), lVar, 0), a(cellStyle1.getIconColor(), lVar, 0), a(cellStyle1.getBorderColor(), lVar, 0), a(cellStyle1.getDividerColor(), lVar, 0), null);
        lVar.l();
        lVar.o(-1207503431);
        OrcaCell cellStyle2 = screen.getTableCells().getCellStyle2();
        C3696po c3696po2 = new C3696po(a(cellStyle2.getBackgroundColor(), lVar, 0), a(cellStyle2.getTextColor(), lVar, 0), a(cellStyle2.getIconColor(), lVar, 0), a(cellStyle2.getBorderColor(), lVar, 0), a(cellStyle2.getDividerColor(), lVar, 0), null);
        lVar.l();
        Zo zo2 = new Zo(jA5, jA6, jA7, jA8, a(screen.getDividerColor(), lVar, 0), new C3739qo(c3696po, c3696po2), null);
        lVar.l();
        lVar.o(-1207484558);
        OrcaHint hint = orcaColors.getHint();
        Ho ho2 = new Ho(a(hint.getTextColor(), lVar, 0), a(hint.getBackgroundColor(), lVar, 0), a(hint.getBorderColor(), lVar, 0), null);
        lVar.l();
        lVar.o(-1207475556);
        OrcaInputField inputField = orcaColors.getInputField();
        Io io2 = new Io(a(inputField.getTextColor(), lVar, 0), a(inputField.getBackgroundColor(), lVar, 0), a(inputField.getBorderColor(), lVar, 0), a(inputField.getDisabledTextColor(), lVar, 0), a(inputField.getDisabledBackgroundColor(), lVar, 0), a(inputField.getDisabledBorderColor(), lVar, 0), a(inputField.getPlaceholderColor(), lVar, 0), a(inputField.getTitleColor(), lVar, 0), a(inputField.getStatusColor(), lVar, 0), a(inputField.getErrorColor(), lVar, 0), null);
        lVar.l();
        lVar.o(-1207452008);
        OrcaPopup popup = orcaColors.getPopup();
        Uo uo2 = new Uo(a(popup.getTitleColor(), lVar, 0), a(popup.getMessageColor(), lVar, 0), a(popup.getBackgroundColor(), lVar, 0), null);
        lVar.l();
        lVar.o(-1207443104);
        OrcaScanner orcaScanner = orcaColors.getCom.fourthline.analytics.internal.AnalyticsContext.Scanner java.lang.String();
        long jA9 = a(orcaScanner.getProgressColor(), lVar, 0);
        long jA10 = a(orcaScanner.getSpinnerColor(), lVar, 0);
        lVar.o(-1207436991);
        OrcaScannerConfirmation confirmation = orcaScanner.getConfirmation();
        Yo yo2 = new Yo(a(confirmation.getTextColor(), lVar, 0), a(confirmation.getBackgroundColor(), lVar, 0), a(confirmation.getBulletListColor(), lVar, 0), null);
        lVar.l();
        Xo xo2 = new Xo(jA10, jA9, yo2, null);
        lVar.l();
        Qo qo2 = new Qo(z12 ? k3.p1.INSTANCE.k() : k3.r1.d(4278650916L), z12 ? k3.r1.d(4283979864L) : k3.p1.INSTANCE.k(), a(orcaColors.getCom.fourthline.analytics.internal.AnalyticsContext.Scanner java.lang.String().getProgressColor(), lVar, 0), z12 ? k3.r1.d(4292598747L) : k3.p1.p(k3.p1.INSTANCE.k(), 0.3f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), k3.r1.d(4288124823L), null);
        lVar.o(-1207410654);
        OrcaGraphic graphic = orcaColors.getGraphic();
        Go go2 = new Go(a(graphic.getBackgroundColor(), lVar, 0), a(graphic.getPrimaryColor(), lVar, 0), null);
        lVar.l();
        long jD = k3.r1.d(z12 ? 4293454056L : 4281285448L);
        long jD2 = k3.r1.d(3006477107L);
        long jD3 = k3.r1.d(4281545523L);
        long jD4 = k3.r1.d(4278247522L);
        long jD5 = k3.r1.d(4294927872L);
        lVar.o(-1207395182);
        OrcaBox box = orcaColors.getBox();
        C3567mo c3567mo = new C3567mo(a(box.getBackgroundColor(), lVar, 0), a(box.getBorderColor(), lVar, 0), a(box.getTitleColor(), lVar, 0), null);
        lVar.l();
        long jA11 = z12 ? k3.p1.INSTANCE.a() : k3.p1.INSTANCE.k();
        long jA12 = z12 ? k3.p1.INSTANCE.a() : k3.p1.INSTANCE.k();
        lVar.o(-1207381113);
        Zh internalPalette = orcaColors.getPalette().getInternalPalette();
        C3524lo c3524lo = new C3524lo(a(orcaColors.getGraphic().getPrimaryColor(), lVar, 0), a(internalPalette.m(), lVar, 0), a(internalPalette.h(), lVar, 0), a(internalPalette.e(), lVar, 0), a(internalPalette.i(), lVar, 0), null);
        lVar.l();
        C3824so c3824so = new C3824so(jA, jA2, c3653oo, zo2, c3567mo, ho2, io2, uo2, xo2, qo2, go2, jD, jD2, jD3, jD4, jD5, jA11, jA12, c3524lo, a(orcaColors.getPalette().getInternalPalette().l(), lVar, 0), z12, null);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return c3824so;
    }

    public static final long a(OrcaColors.OrcaColor orcaColor, p020r2.l lVar, int i11) {
        long jE;
        p013kotlin.jvm.internal.s.k(orcaColor, "<this>");
        lVar.o(277934545);
        if (p020r2.o.J()) {
            p020r2.o.S(277934545, i11, -1, "com.fourthline.orca.core.internal.styling.color.toComposeColor (OrcaColors.kt:177)");
        }
        if (orcaColor instanceof OrcaColors.OrcaColor.FromInt) {
            OrcaColors.OrcaColor.FromInt fromInt = (OrcaColors.OrcaColor.FromInt) orcaColor;
            jE = k3.r1.e(((fromInt.getColor() >> 16) & 255) / 255.0f, ((fromInt.getColor() >> 8) & 255) / 255.0f, (fromInt.getColor() & 255) / 255.0f, 1.0f, null, 16, null);
        } else if (orcaColor instanceof OrcaColors.OrcaColor.FromLong) {
            jE = k3.r1.d(((OrcaColors.OrcaColor.FromLong) orcaColor).getColor());
        } else if (orcaColor instanceof OrcaColors.OrcaColor.FromRes) {
            jE = e4.b.a(((OrcaColors.OrcaColor.FromRes) orcaColor).getId(), lVar, 0);
        } else {
            if (!(orcaColor instanceof OrcaColors.OrcaColor.FromColor)) {
                throw new NoWhenBranchMatchedException();
            }
            if (Build.VERSION.SDK_INT >= 26) {
                OrcaColors.OrcaColor.FromColor fromColor = (OrcaColors.OrcaColor.FromColor) orcaColor;
                jE = k3.r1.e(fromColor.getColor().getComponent(0), fromColor.getColor().getComponent(1), fromColor.getColor().getComponent(2), fromColor.getColor().getComponent(3), null, 16, null);
            } else {
                String string = ((OrcaColors.OrcaColor.FromColor) orcaColor).getColor().toString();
                p013kotlin.jvm.internal.s.j(string, "toString(...)");
                String strSubstring = string.substring(6, 24);
                p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
                List listF1 = p013kotlin.text.t.f1(strSubstring, new String[]{","}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listF1, 10));
                Iterator it = listF1.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf(Float.parseFloat((String) it.next())));
                }
                jE = k3.r1.e(((Number) arrayList.get(0)).floatValue(), ((Number) arrayList.get(1)).floatValue(), ((Number) arrayList.get(2)).floatValue(), ((Number) arrayList.get(3)).floatValue(), null, 16, null);
            }
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return jE;
    }

    private static final C3653oo.a a(OrcaButtons.OrcaButton orcaButton, p020r2.l lVar, int i11) {
        lVar.o(265449310);
        if (p020r2.o.J()) {
            p020r2.o.S(265449310, i11, -1, "com.fourthline.orca.core.internal.styling.color.toComposeVariant (OrcaColors.kt:202)");
        }
        C3653oo.a aVar = new C3653oo.a(a(orcaButton.getTextColor(), lVar, 0), a(orcaButton.getBackgroundColor(), lVar, 0), a(orcaButton.getBorderColor(), lVar, 0), null);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return aVar;
    }
}
