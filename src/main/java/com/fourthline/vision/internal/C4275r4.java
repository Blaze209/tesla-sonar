package com.fourthline.vision.internal;

import com.fourthline.vision.ScannerMetadata;
import java.net.URI;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.vision.internal.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4275r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f38810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScannerMetadata f38811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final URI f38812c;

    public C4275r4(List<? extends K5> stepResults, ScannerMetadata metadata, URI uri) {
        p013kotlin.jvm.internal.s.k(stepResults, "stepResults");
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        this.f38810a = stepResults;
        this.f38811b = metadata;
        this.f38812c = uri;
    }

    public ScannerMetadata getMetadata() {
        return this.f38811b;
    }

    public List<K5> getStepResults() {
        return this.f38810a;
    }

    public URI getVideoUrl() {
        return this.f38812c;
    }
}
