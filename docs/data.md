### Definition of 'Webhook'

A webhook is a method of communication between two web applications,
where one application sends data to a specific URL endpoint of another
application in real time. It allows the sender application to trigger
an HTTP request containing data or notifications to the receiver
application. The receiver application can then process the data and
perform actions based on the received information.
Webhooks are commonly used for event-driven scenarios,
data synchronization, and automation and integration purposes.

### About data payload
The specific data passed between two web applications via a webhook
depends on the use case and the applications involved.
The data payload can vary widely and is typically defined by the
sender application and documented in its webhook documentation.
In general, the data sent through a webhook can include relevant
information about an event or a specific action that occurred in
the sender application. This data can be in various formats, such
as JSON (JavaScript Object Notation) or XML (eXtensible Markup Language).

### Our example data in XML format
```
<message>
  <object>message</object>
  <entry>
    <id>100253349659316</id>
    <metadata>
      <from>
        <number>3895412487</number>
        <name>Black</name>
        <surname>Jack</surname>
      </from>
      <to>
        <number>3895412487</number>
        <name>Mick</name>
        <surname>Mack</surname>
      </to>
    </metadata>
  </entry>
</message>
```

