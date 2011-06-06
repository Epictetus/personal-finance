class User < ActiveRecord::Base

	validates_presence_of :login, :name, :password, :email
	validates_size_of :login, :in => 5..12, :to_short => "Login deve ter pelo menos 5 caracteres!", :to_long => "Login deve ter no máximo 12 caracteres!"
	validates_size_of :name, :in => 5..30, :to_short => "Nome deve ter pelo menos 5 caracteres!", :to_long => "Nome deve ter no máximo 30 caracteres!"
	validates_size_of :password, :in => 5..15, :to_short => "Senha deve ter pelo menos 5 caracteres!", :to_long => "Senha deve ter no máximo 15 caracteres!"

	def initialize
		super
		@active = true
	end

end
