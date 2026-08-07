package hu;

import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fu.b f73642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private XmlPullParser f73643b;

    public f(fu.b bVar) {
        this.f73642a = bVar;
    }

    public final long a() throws XmlPullParserException, IOException {
        int next;
        if (this.f73643b == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        do {
            next = this.f73643b.next();
            if (next == 2) {
                if (!this.f73643b.getName().equals("manifest")) {
                    break;
                }
                String attributeValue = this.f73643b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.f73643b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int i11 = Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return i11;
                    }
                    try {
                        return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) i11) & 4294967295L);
                    } catch (NumberFormatException e11) {
                        throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", e11.getMessage()));
                    }
                } catch (NumberFormatException e12) {
                    throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", e12.getMessage()));
                }
            }
        } while (next != 1);
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    public final void b(AssetManager assetManager, File file) {
        this.f73643b = assetManager.openXmlResourceParser(fu.b.c(assetManager, file), "AndroidManifest.xml");
    }
}
