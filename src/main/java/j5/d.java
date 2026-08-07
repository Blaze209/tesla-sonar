package j5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Shader f82639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f82640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f82641c;

    private d(Shader shader, ColorStateList colorStateList, int i11) {
        this.f82639a = shader;
        this.f82640b = colorStateList;
        this.f82641c = i11;
    }

    private static d a(Resources resources, int i11, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i11);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return d(f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(int i11) {
        return new d(null, null, i11);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i11, Resources.Theme theme) {
        try {
            return a(resources, i11, theme);
        } catch (Exception e11) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e11);
            return null;
        }
    }

    public int e() {
        return this.f82641c;
    }

    public Shader f() {
        return this.f82639a;
    }

    public boolean h() {
        return this.f82639a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f82639a == null && (colorStateList = this.f82640b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (!i()) {
            return false;
        }
        ColorStateList colorStateList = this.f82640b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f82641c) {
            return false;
        }
        this.f82641c = colorForState;
        return true;
    }

    public void k(int i11) {
        this.f82641c = i11;
    }

    public boolean l() {
        return h() || this.f82641c != 0;
    }
}
