package wi0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import yh0.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/drawable/Drawable;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final Drawable a(StepStyle stepStyle, Context context) {
        Integer numG;
        s.k(stepStyle, "<this>");
        s.k(context, "context");
        String backgroundImageName = stepStyle.getBackgroundImageName();
        if (backgroundImageName == null || (numG = yh0.s.g(context, backgroundImageName, t.Drawable)) == null) {
            return null;
        }
        return androidx.core.content.b.getDrawable(context, numG.intValue());
    }
}
