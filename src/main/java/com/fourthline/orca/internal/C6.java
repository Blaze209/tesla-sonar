package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.core.flavor.OrcaFonts;
import java.io.File;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class C6 implements InterfaceC3955vp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OrcaFlavor f25185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MutableStateFlow f25186c;

    public C6(Context context, OrcaFlavor flavor, boolean z11, boolean z12) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(flavor, "flavor");
        this.f25184a = context;
        this.f25185b = flavor;
        this.f25186c = StateFlowKt.MutableStateFlow(a(context, z11, z12));
    }

    private final String b(File file) {
        String str = file.getAbsolutePath() + "/styling/";
        new File(str).mkdirs();
        return str + "styling.json";
    }

    @Override // com.fourthline.orca.internal.InterfaceC3955vp
    public StateFlow a() {
        return FlowKt.asStateFlow(this.f25186c);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3955vp
    public void a(boolean z11, boolean z12) {
        this.f25186c.setValue(a(this.f25184a, z11, z12));
    }

    private final OrcaFlavor b() {
        return OrcaFlavor.copy$default(this.f25185b, null, null, null, new OrcaFonts(new OrcaFonts.SystemFont(this.f25185b.getFonts().getScreenHeader().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getScreenTitle().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getScreenMessage().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getPopupHeader().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getPopupMessage().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getPopupTitle().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getPrimaryButton().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getSecondaryButton().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getInputField().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getInputFieldPlaceholder().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getInputFieldTitle().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getInputFieldStatus().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getScannerInstructionText().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getConfirmationScreenTitle().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getConfirmationScreenCheckpoints().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getTableElementTitle().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getTableElementDescription().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getInstructionsLink().getSize()), new OrcaFonts.SystemFont(this.f25185b.getFonts().getHintText().getSize())), null, 23, null);
    }

    private final InterfaceC3868tp a(Context context, boolean z11) {
        File file = new File(ContextExtensionsKt.getFourthlineDirectory(context));
        try {
            String strB = b(file);
            OrcaStyling.Companion bVar = OrcaStyling.INSTANCE;
            return new InterfaceC3868tp.b(bVar.a(strB, bVar.a(strB), a(file)), a(context), z11);
        } catch (Exception unused) {
            return new InterfaceC3868tp.a(b(), z11);
        }
    }

    private final InterfaceC3868tp a(Context context, boolean z11, boolean z12) {
        if (z11) {
            return a(context, z12);
        }
        return new InterfaceC3868tp.a(a(context), z12);
    }

    private final String a(File file) {
        String str = file.getAbsolutePath() + "/fonts/";
        new File(str).mkdirs();
        return str;
    }

    private final OrcaFlavor a(Context context) {
        return AbstractC3972w5.b(context) ? b() : this.f25185b;
    }
}
