package j4;

import android.os.Build;
import android.text.StaticLayout;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lj4/y;", "Lj4/e0;", "<init>", "()V", "Lj4/f0;", "params", "Landroid/text/StaticLayout;", "a", "(Lj4/f0;)Landroid/text/StaticLayout;", "layout", "", "useFallbackLineSpacing", "b", "(Landroid/text/StaticLayout;Z)Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class y implements e0 {
    @Override // j4.e0
    public StaticLayout a(f0 params) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String());
        builderObtain.setTextDirection(params.getTextDir());
        builderObtain.setAlignment(params.getAlignment());
        builderObtain.setMaxLines(params.getMaxLines());
        builderObtain.setEllipsize(params.getEllipsize());
        builderObtain.setEllipsizedWidth(params.getEllipsizedWidth());
        builderObtain.setLineSpacing(params.getLineSpacingExtra(), params.getLineSpacingMultiplier());
        builderObtain.setIncludePad(params.getIncludePadding());
        builderObtain.setBreakStrategy(params.getBreakStrategy());
        builderObtain.setHyphenationFrequency(params.getHyphenationFrequency());
        builderObtain.setIndents(params.getLeftIndents(), params.getRightIndents());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            z.a(builderObtain, params.getJustificationMode());
        }
        if (i11 >= 28) {
            a0.a(builderObtain, params.getUseFallbackLineSpacing());
        }
        if (i11 >= 33) {
            c0.b(builderObtain, params.getLineBreakStyle(), params.getLineBreakWordStyle());
        }
        return builderObtain.build();
    }

    @Override // j4.e0
    public boolean b(StaticLayout layout, boolean useFallbackLineSpacing) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            return c0.a(layout);
        }
        if (i11 >= 28) {
            return useFallbackLineSpacing;
        }
        return false;
    }
}
