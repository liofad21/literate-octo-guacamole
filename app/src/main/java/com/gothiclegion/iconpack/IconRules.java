package com.gothiclegion.iconpack;

public final class IconRules {
    private IconRules() {
    }

    public static boolean matches(String packageName) {
        if (packageName == null || packageName.isEmpty()) {
            return false;
        }

        return packageName.startsWith("com.") || packageName.startsWith("org.") || packageName.startsWith("net.");
    }
}
