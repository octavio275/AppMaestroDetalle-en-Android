package com.example.maestrodetalle;

public  class DummyItem {

    public String id;

    public String website_name;

    public String website_url;

    public DummyItem(String id, String website_name,

                     String website_url)

    {

        this.id = id;

        this.website_name = website_name;

        this.website_url = website_url;

    }

    @Override

    public String toString() {

        return website_name;

    }
    /**

     * An array of sample (dummy) items.

     */

    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**

     * A map of sample (dummy) items, by ID.

     */

    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String,

            DummyItem>();

    static {

        addItem(new DummyItem("1", "Amazon", "http://www.amazon.com"));

        addItem(new DummyItem("2", "Google", "http://www.google.com"));

        addItem(new DummyItem("3", "Android", "http://www.android.com"));

    }

    private static void addItem(DummyItem item) {

        ITEMS.add(item);

        ITEM_MAP.put(item.id, item);

    }

}