package com.fourthline.vision.document;

import android.graphics.Rect;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerDataSource;", "", "shouldStartAutomatically", "", "getShouldStartAutomatically", "()Z", "getDocumentDetectionArea", "Landroid/graphics/Rect;", "getConfig", "Lcom/fourthline/vision/document/DocumentScannerConfig;", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DocumentScannerDataSource {
    DocumentScannerConfig getConfig();

    Rect getDocumentDetectionArea();

    boolean getShouldStartAutomatically();
}
