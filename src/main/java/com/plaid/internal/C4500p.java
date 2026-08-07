package com.plaid.internal;

import java.util.LinkedList;

/* JADX INFO: renamed from: com.plaid.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4500p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f48000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile EnumC4427g7 f48001b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile String f48003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f48004e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f48002c = new LinkedList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4403e1 f48005f = C4403e1.f47632c;

    /* JADX INFO: renamed from: com.plaid.internal.p$a */
    public static class a implements InterfaceC4526s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48007b;

        public a(String str) {
            this.f48006a = str;
        }

        @Override // com.plaid.internal.InterfaceC4526s
        public final int a() {
            return this.f48007b;
        }

        @Override // com.plaid.internal.InterfaceC4526s
        public final String b() {
            return this.f48006a;
        }
    }
}
