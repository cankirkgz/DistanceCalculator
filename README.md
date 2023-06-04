<h1>Distance Calculator</h1>
  <p>This Java program calculates the travel cost based on the distance, age, and type of trip entered by the user. It provides an interactive command-line interface where the user can input the required information.</p>

  <h2>Usage</h2>
  <ol>
    <li>Make sure you have Java installed on your system.</li>
    <li>Compile the <code>Main.java</code> file using the Java compiler:</li>
    <pre><code>javac Main.java</code></pre>
    <li>Run the compiled program:</li>
    <pre><code>java Main</code></pre>
    <li>Follow the prompts and enter the required information as requested:</li>
    <ul>
      <li>Enter the distance in kilometers.</li>
      <li>Enter your age.</li>
      <li>Enter the type of trip (1 for one-way, 2 for round trip).</li>
    </ul>
    <li>The program will calculate the total cost based on the provided information and display it on the console.</li>
  </ol>

  <h2>Requirements</h2>
  <ul>
    <li>Java Development Kit (JDK) installed on your system.</li>
  </ul>

  <h2>How It Works</h2>
  <ol>
    <li>The program uses the <code>Scanner</code> class from the <code>java.util</code> package to read user input from the console.</li>
    <li>It prompts the user to enter the distance, age, and type of trip.</li>
    <li>The entered data is then validated to ensure it meets the required criteria:</li>
    <ul>
      <li>Distance and age must be greater than zero.</li>
      <li>Type of trip must be either 1 (one-way) or 2 (round trip).</li>
    </ul>
    <li>If the entered data is valid, the program calculates the travel cost based on the provided distance, age, and trip type:</li>
    <ul>
      <li>The base cost is calculated by multiplying the distance by a constant rate of 0.1.</li>
      <li>Depending on the age, the cost is adjusted using specific discount percentages.</li>
      <li>If the trip type is round trip, an additional discount is applied.</li>
    </ul>
    <li>The final calculated cost is displayed on the console.</li>
  </ol>

  <h2>Example</h2>
  <pre><code>
  Mesafeyi km türünden giriniz : 500
  Yaşınızı giriniz : 30
  Yolculuk tipini giriniz (1 =&gt; Tek Yön, 2 =&gt; Gidiş Dönüş) : 2

  Toplam Tutar = 80.0 TL
  </code></pre>

  <p>In this example, the user entered a distance of 500 kilometers, an age of 30, and selected a round trip. The program calculated the total cost to be 80.0 Turkish Lira (TL).</p>

  <h2>Note</h2>
  <p>The program assumes that the input values are in the correct format and within the expected range. Proper input validation is recommended to
