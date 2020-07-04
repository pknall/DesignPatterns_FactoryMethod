#Factory Method Design Pattern
- - -
What if you wanted to dynamically construct a document, but you have multiple document types to choose from?
What if you weren't sure which platform you needed to support, or you need to support multiple platforms that
may change at a later date?

This application uses the Factory Method Design Pattern to address these situations.
The Document Factory Abstract Class (ADocutmentFactory) allows for multiple platforms to be supported
based on which platform is specified at construction.  To keep the example limited, only the Microsoft and 
OpenOffice platforms are used in this example.  

When constructing a document (ADocument), a document factory (ADocumentFactory) is used to construct the
appropriate document.  An argument is passed into the document factory to specify which object to construct.
Depending on which platform is used (Microsoft or OpenOffice) the appropriate document is returned when either
"WORD_PROCESSOR", "SPREADSHEET" or "PRESENTATION" are selected.  


