// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package bootswatch.proxies;

public enum Selects
{
	_1(new java.lang.String[][] { new java.lang.String[] { "en_US", "1" } }),
	_2(new java.lang.String[][] { new java.lang.String[] { "en_US", "2" } }),
	_3(new java.lang.String[][] { new java.lang.String[] { "en_US", "3" } }),
	_4(new java.lang.String[][] { new java.lang.String[] { "en_US", "4" } }),
	_5(new java.lang.String[][] { new java.lang.String[] { "en_US", "5" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Selects(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
