from tkinter import *
root = Tk()
root.title("Simple GUI")
root.geometry("200X100")

app = Frame(root)
app.grid()
button1 = Button(app text = "this is uton")
button1.grid()

button2 = Button(app)
button2.grid()
button2.configure(text= "his will show text")

label = Label(app text = "This is label")
label.grid()

root.mainloop()
